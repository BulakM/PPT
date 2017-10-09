package ucetnidoklad;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Třída pro administraci účetního dokladu
 * @author tym2
 */
public class AdministraceDoklad {

    /**
     * 
     * @param cisloDokladu Jedinečné číslo dokladu
     * @return Vrátí všechny údaje o účetním dokladu, pokud jsou hodnoty správně zadány
     */
    public static VypoctenyDoklad novyDoklad(int cisloDokladu){
        Scanner scan = new Scanner(System.in);
        System.out.println("Zadejte cenu bez DPH: ");
        try{
            float cena = scan.nextFloat();
            System.out.println("Zadejte procento DPH: ");
            int dph = scan.nextInt();
            VypoctenyDoklad doklad = new VypoctenyDoklad(cisloDokladu, cena, dph);
            return doklad;
        }catch (Exception ex){
            System.out.println("Špatný formát dat. Doklad nebyl uložen.");
        }
        return null;
    }

    /**
     * 
     * @param doklady pole všech účetních dokladů
     * @param pocet celkový počet všech účetních dokladů
     */
    public static void vypisDokladu(VypoctenyDoklad doklady[], int pocet){
        System.out.println("Vypis vsech dokladu");
        for (int i = 0; i < pocet -1; i++) {
            System.out.println(doklady[i].toString());
        }
    }

    /**
     * 
     * @param doklady pole všech účetních dokladů
     * @param pocet celkový počet všech účetních dokladů
     * @throws FileNotFoundException vyjímka, když soubor nebude existovat
     * @throws IOException vyjímka, pokud doklady nelze zapsat do souboru
     */
    public static void vypisDoSouboruCSV(VypoctenyDoklad doklady[], int pocet) throws FileNotFoundException, IOException {
        FileWriter fw = new FileWriter("doklady.csv", false);
        if(fw != null) {
            try{
                fw.append("Cislo dokladu");
                fw.append(',');
                fw.append("Cena bez DPH");
                fw.append(',');
                fw.append("Sazba DPH");
                fw.append(',');
                fw.append("DPH");
                fw.append(',');
                fw.append("Cena s DPH");
                fw.append('\n');
                for (int i = 0; i < pocet - 1; i++){
                    fw.append(Integer.toString(doklady[i].getCisloDokladu()));
                    fw.append(',');
                    fw.append(Float.toString(doklady[i].getCelkemBezDph()));
                    fw.append(',');
                    fw.append(Integer.toString(doklady[i].getProcentoDph()));
                    fw.append(',');
                    fw.append(Float.toString(doklady[i].getDph()));
                    fw.append(',');
                    fw.append(Float.toString(doklady[i].getCelkemSDph()));
                    fw.append('\n');
                }
                fw.flush();
                fw.close();
            }catch(IOException ex){
                throw new IOException("Nelze uložit doklady.");
            }
    } else {
            throw new FileNotFoundException("Souboru neexistuje.");
        }
    }
    /**
     * 
     * @param doklady pole všech účetních dokladů
     * @param cisloDokladu jedinečné číslo dokladu
     */
    public static void upravitDoklad(VypoctenyDoklad doklady[], int cisloDokladu){
        Scanner scan = new Scanner(System.in);
        System.out.println("Zadejte cislo dokladu, ktery chcete upravit:");
        try{
            int cisloD = scan.nextInt();
            if((cisloD > 0 ) && (cisloD < cisloDokladu)){
                System.out.println("Chcete upravit cenu bez DPH (zadejte 1), nebo procentni sazbu DPH (zadejte 0)");
                int cislo = scan.nextInt();
                if (cislo == 1){
                    System.out.println("Zadejte novou cenu bez DPH");
                    float novaCena = scan.nextFloat();
                    doklady[cisloD-1].setCelkemBezDph(novaCena);
                }else if(cislo == 0){
                    System.out.println("Zadejte novou procentni sazbu DPH");
                    int novaDph = scan.nextInt();
                    doklady[cisloD-1].setProcentoDph(novaDph);
                }else{
                    System.out.println("Spatne cislo volby.");
                }
            }else{
                System.out.println("Spatne cislo dokladu");
            }
        }catch (Exception ex){
            System.out.println("Špatný formát dat. Doklad nelze změnit.");
        }
    }

    /**
     * 
     * @param args
     * @throws FileNotFoundException vyjímka, když soubor nebude existovat
     * @throws IOException vyjímka, pokud doklady nelze zapsat do souboru
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        VypoctenyDoklad[] doklady = new VypoctenyDoklad[100];
        Scanner scan = new Scanner(System.in);
        int cisloDokladu = 1;
        int prom = 1;
        do{
            System.out.println("Zadejte cislo operace, kterou chcete provest:\n 1 - Novy doklad\n 2 - Uprava dokladu\n 3 - Vypis vsech dokladu\n 4 - Ulozeni dokladu do souboru ve formatu csv\n 0 - KONEC");
            try{
                prom = scan.nextInt();
            }catch(Exception ex){
                System.out.println("Chyba při výběru položky.");
                prom = 0;
            }
            switch(prom){
                case 1:
                    VypoctenyDoklad doklad = novyDoklad(cisloDokladu);
                    if (doklad != null){
                        doklady[cisloDokladu-1] = doklad;
                        cisloDokladu++;
                    }
                    break;
                case 2:
                    upravitDoklad(doklady, cisloDokladu);
                    break;
                case 3:
                    vypisDokladu(doklady, cisloDokladu);
                    break;
                case 4:
                    vypisDoSouboruCSV(doklady, cisloDokladu);
                    break;
                default:
                    if(prom != 0){
                        System.out.println("Volba neni k dispozici");
                    }
            }
        }while((prom > 0) || (prom < 0));
    }
}
