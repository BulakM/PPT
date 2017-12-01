package ppt.cv6;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Integer> cisla;

    public static void main(String[] args) {
        // write your code here
        System.out.println("Nacist cisla ze vstupu (0) nebo ze souboru (1): ");
        cisla = new ArrayList<Integer>();
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
        System.out.println("Zadavejte cisla (konec 0)");
        Scanner reader = new Scanner(System.in);
        do {
            cisla.add(reader.nextInt());
        } while (cisla.get(cisla.size() - 1) != 0);
        reader.close();
        cisla.remove(cisla.size() - 1);
        int soucet = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int cislo : cisla) {
            soucet += cislo;
            if (cislo < min) min = cislo;
            if (cislo > max) max = cislo;
        }
        System.out.println("Nejvetsi zadane cislo je " + max);
        System.out.println("Nejmensi zadane cislo je " + min);
        System.out.println("Soucet zadanych cisel je " + soucet);
        System.out.println("Prumer zadanych cisel je " + (float) soucet / cisla.size());
    }

    public static void Process2() {
        File soubor = new File("cisla.txt");
        try {
            Scanner reader = new Scanner(soubor);
            while (reader.hasNextLine()) {
                cisla.add(reader.nextInt());
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int soucet = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int cislo : cisla) {
            soucet += cislo;
            if (cislo < min) min = cislo;
            if (cislo > max) max = cislo;
        }
        System.out.println("Nejvetsi zadane cislo je " + max);
        System.out.println("Nejmensi zadane cislo je " + min);
        System.out.println("Soucet zadanych cisel je " + soucet);
        System.out.println("Prumer zadanych cisel je " + (float) soucet / cisla.size());
    }
}
