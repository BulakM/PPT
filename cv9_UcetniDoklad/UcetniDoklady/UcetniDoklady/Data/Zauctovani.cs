using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UcetniDoklady.Data
{
    class Zauctovani
    {
        public string Zauctoval { get; set; }
        public DateTime Datum_Zauctovani { get; set; }
        public Doklad DokladZauct { get; set; }
        public bool Zauct { get; set; }

        public Zauctovani(string zauctoval, DateTime datum_Zauctovani, Doklad dokladZauct)
        {
            Zauctoval = zauctoval;
            Datum_Zauctovani = datum_Zauctovani;
            DokladZauct = dokladZauct;
            Zauct = false;
        }

        public Decimal Zauctuj()
        {
            if (DokladZauct.Datum_Splanosti <= DokladZauct.Datum_Vystaveni)
                throw new Exception(Properties.Resources.IDSE_ERROR_DT);

            if (!DokladZauct.Calc)
                throw new Exception(Properties.Resources.IDSE_ERROR_NOT_CALC);

            if (DokladZauct.SazbaDPH > 0)
            {
                if (DokladZauct.Datum_Vystaveni.Year <= 2010)
                {
                    Decimal decTmp = DokladZauct.CenaSDPH;
                    DokladZauct.CenaSDPH = Decimal.Round(DokladZauct.CenaSDPH, 0);
                    DokladZauct.Zaokr = decTmp - DokladZauct.CenaSDPH;
                }
                else
                    if (DokladZauct.Datum_Vystaveni.Year <= 2014)
                    {
                        Decimal decTmp = DokladZauct.CenaSDPH;
                        DokladZauct.CenaSDPH = Decimal.Ceiling(DokladZauct.CenaSDPH);
                        DokladZauct.Zaokr = decTmp - DokladZauct.CenaSDPH;
                    }
                    else
                    {
                        Decimal decTmp = DokladZauct.CenaSDPH;
                        DokladZauct.CenaSDPH = Decimal.Ceiling(DokladZauct.CenaSDPH);
                        DokladZauct.Zaokr = decTmp - DokladZauct.CenaSDPH;
                    }
            }
            else
            {
                DokladZauct.Zaokr = new Decimal(0.0);
            }

            return DokladZauct.CenaSDPH;
        }

    }
}
