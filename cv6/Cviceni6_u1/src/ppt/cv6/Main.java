package ppt.cv6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int pocet = 0;
        int cisla = 0;
        int cislo = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.println("Zadavejte cisla (konec 0)\n");
        Scanner reader = new Scanner(System.in);
        cislo = reader.nextInt();
        while (cislo != 0) {
            cisla += cislo;
            pocet++;
            if (cislo > max) max = cislo;
            if (cislo < min) min = cislo;
            cislo = reader.nextInt();
        }
        reader.close();
        System.out.println("Nejvetsi zadane cislo je " + max + "\n");
        System.out.println("Nejmensi zadane cislo je " + min + "\n");
        System.out.println("Soucet zadanych cisel je " + cisla + "\n");
        System.out.println("Prumer zadanych cisel je " + cisla/pocet + "\n");
    }
}
