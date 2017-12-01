package ppt.cv6;

import java.util.ArrayList;

public class DataProcessing {
    ArrayList<Integer> cisla;
    int soucet;
    int min;
    int max;

    public DataProcessing() {
        cisla = new ArrayList<Integer>();
        soucet = 0;
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;

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

    public void Process1() { }

    public void Process2() { }

    public void Tisk(boolean tiskZahlavi) {
        Tisk(tiskZahlavi, false);
    }

    public void Tisk() {
        Tisk(false, false);
    }
}
