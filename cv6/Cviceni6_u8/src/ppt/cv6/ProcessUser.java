package ppt.cv6;

import java.util.Scanner;

public class ProcessUser implements DataProcessing {

    @Override
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
}
