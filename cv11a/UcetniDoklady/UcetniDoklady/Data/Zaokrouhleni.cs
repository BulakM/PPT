using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UcetniDoklady.Data
{
    interface Zaokrouhleni
    {
        decimal Zaok(decimal original);
    }

    class Nahoru : Zaokrouhleni
    {
        public decimal Zaok(decimal original)
        {
            return Decimal.Ceiling(original);
        }
    }

    class Dolu : Zaokrouhleni
    {
        public decimal Zaok(decimal original)
        {
            return Decimal.Round(original, 0);
        }
    }

    abstract class Creator
    {
        public abstract Zaokrouhleni FactoryMethod(bool round);
    }

    class ConcreteCreator : Creator
    {
        public override Zaokrouhleni FactoryMethod(bool round)
        {
            if (round) return new Nahoru();
            else return new Dolu();
        }
    }
}
