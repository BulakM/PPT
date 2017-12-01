package ppt.cv6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataProcessing {
    private ArrayList<Integer> cisla;
    private int soucet;
    private int min;
    private int max;

    public DataProcessing() {
        cisla = new ArrayList<Integer>();
        soucet = 0;
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;

    }

    public void Process1() {
        System.out.println("Zadavejte cisla (konec 0)");
        Scanner reader = new Scanner(System.in);
        do {
            cisla.add(reader.nextInt());
        } while (cisla.get(cisla.size() - 1) != 0);
        reader.close();
        cisla.remove(cisla.size() - 1);
        for (int cislo : cisla) {
            soucet += cislo;
            if (cislo < min) min = cislo;
            if (cislo > max) max = cislo;
        }
        Tisk(true);
    }

    public void Process2() {
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
        for (int cislo : cisla) {
            soucet += cislo;
            if (cislo < min) min = cislo;
            if (cislo > max) max = cislo;
        }
        Tisk(false, true);
    }

    public void Tisk(boolean tiskZahlavi, boolean tiskHodnotyOnly) {
        if (tiskZahlavi) System.out.println("Celá čísla a její extrémní hodnoty");
        System.out.print("Nactene hodnoty jsou: ");
        cisla.forEach(item->System.out.print(item + " "));
        if (!(tiskHodnotyOnly)) {
            System.out.println("\nNejvetsi zadane cislo je " + max);
            System.out.println("Nejmensi zadane cislo je " + min);
            System.out.println("Soucet zadanych cisel je " + soucet);
            System.out.println("Prumer zadanych cisel je " + (float) soucet / cisla.size());
        }
    }

    public void Tisk(boolean tiskZahlavi) {
        Tisk(tiskZahlavi, false);
    }

    public void Tisk() {
        Tisk(false, false);
    }
}
