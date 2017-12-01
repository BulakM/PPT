using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UcetniDoklady.Data
{
    class ZauctovaniDokladu
    {
        public string Zauctoval { get; set; }
        public DateTime Datum_Zauctovani { get; set; }
        public Doklad DokladZauct { get; set; }
        public bool Zauct { get; set; }

        public ZauctovaniDokladu(string zauctoval, DateTime datum_Zauctovani, Doklad dokladZauct)
        {
            Zauctoval = zauctoval;
            Datum_Zauctovani = datum_Zauctovani;
            DokladZauct = dokladZauct;
            Zauct = false;
        }

        public Decimal Zauctuj()
        {
            ValidateDokladKForZauctovani();

            return Zaokrouhleni();
        }

        private void ValidateDokladKForZauctovani()
        {
            if (DokladZauct.Datum_Splanosti <= DokladZauct.Datum_Vystaveni)
                ExceptionRaiser(Properties.Resources.IDSE_ERROR_DT);

            if (!DokladZauct.Calc)
                ExceptionRaiser(Properties.Resources.IDSE_ERROR_NOT_CALC);
        }

        private Decimal Zaokrouhleni()
        {
            if (DokladZauct.SazbaDPH > 0)
            {
                if (DokladZauct.Datum_Vystaveni.Year <= 2010)
                    RoundCenaSDPH(true);
                else
                    RoundCenaSDPH(false);
            }
            else
            {
                DokladZauct.Zaokr = new Decimal(0.0);
            }

            return DokladZauct.CenaSDPH;
        }

        private void RoundCenaSDPH(bool round)
        {
            Decimal decTmp = DokladZauct.CenaSDPH;

            if (round) DokladZauct.CenaSDPH = Decimal.Round(DokladZauct.CenaSDPH, 0);
            else DokladZauct.CenaSDPH = Decimal.Ceiling(DokladZauct.CenaSDPH);

            DokladZauct.Zaokr = decTmp - DokladZauct.CenaSDPH;
        }

        private void ExceptionRaiser(string exception)
        {
            throw new Exception(exception);
        }

    }
}
