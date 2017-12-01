/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacciho.posloupnost;
import Fibonacci.Fibonacci;

/**
 *
 * @author janous11
 */
public class FibonaccihoPosloupnost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        System.out.print("Zadej kolikátý prvek chceš vypočítat: ");
        n = 10;
        System.out.println(n);
        Fibonacci Fb = new Fibonacci();
        int[] p = new int[n+1];
        for (int i=0; i<n; i++) p[i] = 0;
        System.out.println("\nProvedené výpočty: ");
        System.out.println("1. Rekurzivně");
        System.out.println(Fb.CalcRek(n));
        System.out.println("2. Nerekurzivně");
        System.out.println(Fb.CalcNerek(n));
        System.out.println("3. Rekurzivně s pamatováním prvků");
        System.out.println(Fb.CalcRekTable(n,p));
        System.out.println("Pro informaci uvádíme výpis pole");
        for (int i = 0; i <p.length; i++) {
            System.out.print(p[i] + ", ");
        }



    }

}
