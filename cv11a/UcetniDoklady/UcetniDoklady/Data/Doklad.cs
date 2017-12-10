using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

public enum TypDokladu
{
    Vydajovy_doklad = 0,
    Prijmovy_doklad = 1
}
public enum FormaDokladu
{
    Faktura = 0,
    Zalohova_faktura = 1
}

namespace UcetniDoklady.Data
{
    class Doklad
    {
        public string CisloDokladu { get; set; }
        public DateTime Datum_Vystaveni { get; set; }
        public DateTime Datum_Splanosti { get; set; }
        public Decimal CenaBezDPH { get; set; }
        public int SazbaDPH { get; set; }
        public Decimal DPH { get; set; }
        public Decimal CenaSDPH { get; set; }
        public bool Calc { get; private set; }
        public bool Zauct { get; set; }

        public TypDokladu Typ { get; set; }

        public FormaDokladu Forma { get; set; }
        private Decimal _zaokr;
        public Decimal Zaokr 
        {
            get { return _zaokr; }
            set
            {
                if (Zauct == false)
                {
                    _zaokr = value;
                    Zauct = true;
                }
            }
        }

        public Doklad(string cisloDokladu, DateTime datum_Vystaveni, Decimal cenaBezDPH, string typ, string forma)
        {
            Typ = (TypDokladu)Enum.Parse(typeof(TypDokladu), typ);
            Forma = (FormaDokladu)Enum.Parse(typeof(FormaDokladu), forma);
            CisloDokladu = cisloDokladu;
            Datum_Vystaveni = datum_Vystaveni;
            CenaBezDPH = cenaBezDPH;
            
            SazbaDPH = -1;
            Datum_Splanosti = Datum_Vystaveni;
            DPH = new decimal(0);
            CenaSDPH = new decimal(0);
            Zaokr = new decimal(0);
            Calc = false;
            Zauct = false;
        }

        public Doklad(string cisloDokladu, DateTime datum_Vystaveni, Decimal cenaBezDPH, int sazbaDPH, TypDokladu typ, FormaDokladu forma)
        {
            Typ = typ;
            Forma = forma;
            CisloDokladu = cisloDokladu;
            Datum_Vystaveni = datum_Vystaveni;
            CenaBezDPH = cenaBezDPH;
            SazbaDPH = sazbaDPH;

            Datum_Splanosti = Datum_Vystaveni;
            Datum_Splanosti.AddDays(14); 

            CalculatePrice();

            Zaokr = new decimal(0);
            Calc = false;
            Zauct = false;
        }

        public Doklad(Doklad d)
        {
            CisloDokladu = d.CisloDokladu;
            Datum_Vystaveni = d.Datum_Vystaveni;
            CenaBezDPH = d.CenaSDPH;
            SazbaDPH = d.SazbaDPH;

            Datum_Splanosti = d.Datum_Splanosti;
            DPH = d.DPH;
            CenaSDPH = d.CenaSDPH;
            Calc = d.Calc;

            Zaokr = d.Zaokr;
            Calc = d.Calc;
            Zauct = d.Zauct;
        }

        public static bool operator ==(Doklad d1, Doklad d2)
        {
            return d1.CisloDokladu == d2.CisloDokladu; // todo all
        }

        public static bool operator !=(Doklad d1, Doklad d2)
        {
            return d1.CisloDokladu != d2.CisloDokladu; // todo all
        }

        public static implicit operator List<object>(Doklad v)
        {
            throw new NotImplementedException();
        }

        public void CalculatePrice()
        {
            DPH = SazbaDPH * CenaBezDPH / 100;
            CenaSDPH = CenaBezDPH + DPH;
            Calc = true;
        }

    }
}
