/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fibonacci;

/**
 *
 * @author janous11
 */
public class Fibonacci {

    public int CalcRek(int n)
        {
            if (n == 0) return 0;
            else if (n == 1) return 1;
            else return CalcRek(n-1) + CalcRek(n-2);
        }

        public int CalcRekTable(int n, int[] p)
        {
            if (n == 0)
            {
                p[n] = 0;
                return p[n];
            }
            else if (n == 1)
            {
                p[n] = 1;
                return p[n];
            }
            else
            {
                p[n] = CalcRek(n-1) + CalcRek(n-2)
                return p[n];
            }
        }

        public int CalcNerek(int n)
        {
            if (n == 0) return 0;
            else if (n == 1) return 1;
            int PrPosl = 0;
            int Posl = 1;
            int Result = 0;
            for (int i = 1; i < n; i++)
            {
                Result = PrPosl + Posl;
                PrPosl = Posl;
                Posl = Result;
            }
            return Result;
        }

}
