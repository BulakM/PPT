package ppt.cv6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProcessFile implements DataProcessing {

    @Override
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
}
