package ppt.cv6;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Nacist cisla ze vstupu (0) nebo ze souboru (1): ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            switch (br.readLine()) {
                case "0": {
                    Process1();
                    break;
                }
                case "1": {
                    Process2();
                    break;
                }
                default: {
                    System.out.println("Neznama moznost");
                }
            }
        } catch (IOException e) {
            System.out.println("Neznama moznost");
        }
    }

    public static void Process1() {
        int pocet = 0;
        int cisla = 0;
        int cislo = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.println("Zadavejte cisla (konec 0)");
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
        System.out.println("Nejvetsi zadane cislo je " + max);
        System.out.println("Nejmensi zadane cislo je " + min);
        System.out.println("Soucet zadanych cisel je " + cisla);
        System.out.println("Prumer zadanych cisel je " + (float) cisla / pocet);
    }

    public static void Process2() {
        File soubor = new File("cisla.txt");
        int pocet = 0;
        int cisla = 0;
        int cislo = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        try {
            Scanner reader = new Scanner(soubor);
            while (reader.hasNextLine()) {
                cislo = reader.nextInt();
                cisla += cislo;
                pocet++;
                if (cislo > max) max = cislo;
                if (cislo < min) min = cislo;
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Nejvetsi zadane cislo je " + max);
        System.out.println("Nejmensi zadane cislo je " + min);
        System.out.println("Soucet zadanych cisel je " + cisla);
        System.out.println("Prumer zadanych cisel je " + (float) cisla / pocet);
    }
}
