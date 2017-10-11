package ucetnidoklad;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Třída pro administraci účetního dokladu
 * @author tym2
 */
public class AdministraceDoklad {

    /**
     * Metoda pro vytvoření kompletního dokladu
     * @return Vrátí všechny údaje o účetním dokladu, pokud jsou hodnoty správně zadány
     */
    public static VypoctenyDoklad novyDoklad(){
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Zadejte číslo dokladu: ");
            int cislo = scan.nextInt();
            System.out.println("Zadejte cenu bez DPH: ");
            float cena = scan.nextFloat();
            System.out.println("Zadejte procento DPH: ");
            int dph = scan.nextInt();
            VypoctenyDoklad doklad = new VypoctenyDoklad(cislo, cena, dph);
            System.out.println("Doklad byl úspěšně vytvořen");
            return doklad;
        }catch (Exception ex){
            System.out.println("Špatný formát dat. Doklad nebyl uložen.");
        }
        return null;
    }

    /**
     * Vypíše všechny doklady 
     * @param doklady pole všech účetních dokladů
     */
    public static void vypisDokladu(LinkedList<VypoctenyDoklad> doklady){
        System.out.println("Vypis vsech dokladu");
        for (int i = 0; i < doklady.size(); i++) {
            System.out.println(doklady.get(i).toString());
        }
    }

    /**
     * Vypíše doklady do souboru csv
     * @param doklady pole všech účetních dokladů
     * @throws FileNotFoundException vyjímka, když soubor nebude existovat
     * @throws IOException vyjímka, pokud doklady nelze zapsat do souboru
     */
    public static void vypisDoSouboruCSV(LinkedList<VypoctenyDoklad> doklady) throws FileNotFoundException, IOException {
        FileWriter fw = new FileWriter("doklady.csv", false);
        if(fw != null) {
            try{
                fw.append("Datum vlozeni");
                fw.append(',');
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
                for (int i = 0; i < doklady.size(); i++){
                    fw.append(doklady.get(i).getDatumVytvoreni());
                    fw.append(',');
                    fw.append(Integer.toString(doklady.get(i).getCisloDokladu()));
                    fw.append(',');
                    fw.append(Float.toString(doklady.get(i).getCelkemBezDph()));
                    fw.append(',');
                    fw.append(Integer.toString(doklady.get(i).getProcentoDph()));
                    fw.append(',');
                    fw.append(Float.toString(doklady.get(i).getDph()));
                    fw.append(',');
                    fw.append(Float.toString(doklady.get(i).getCelkemSDph()));
                    fw.append('\n');
                }
                fw.flush();
                fw.close();
                System.out.println("Doklady byly úspěšně vypsány do souboru");
            }catch(IOException ex){
                throw new IOException("Nelze uložit doklady.");
            }
    } else {
            throw new FileNotFoundException("Souboru neexistuje.");
        }
    }
    
    /**
     * Upraví cenu bez dph nebo procentní sazbu dokladu a doklad přepočítá
     * @param doklady pole všech účetních dokladů
     */
    public static void upravitDoklad(LinkedList<VypoctenyDoklad> doklady){
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Zadejte cislo dokladu, ktery chcete upravit:");
            int cisloD = scan.nextInt();
            VypoctenyDoklad pom = new VypoctenyDoklad(cisloD, 0, 0);
            if(doklady.contains(pom)){
                int cisloIndexOf = doklady.indexOf(pom);
                System.out.println("Chcete upravit cenu bez DPH (zadejte 1), nebo procentni sazbu DPH (zadejte 0)");
                int cislo = scan.nextInt();
                if (cislo == 1){
                    System.out.println("Zadejte novou cenu bez DPH");
                    float novaCena = scan.nextFloat();
                    doklady.get(cisloIndexOf).setCelkemBezDph(novaCena);
                    System.out.println("Doklad byl úspěšně upraven");
                }else if(cislo == 0){
                    System.out.println("Zadejte novou procentni sazbu DPH");
                    int novaDph = scan.nextInt();
                    doklady.get(cisloIndexOf).setProcentoDph(novaDph);
                    System.out.println("Doklad byl úspěšně upraven");
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
     * Vyhledá doklad na základě čísla dokladu a tento doklad vypíše
     * @param doklady pole všech účetních dokladů
     */
    public static void vyhledatDoklad(LinkedList<VypoctenyDoklad> doklady){
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Zadejte číslo dokladu, který chcete vyhledat:");
            int cislo = scan.nextInt();
            VypoctenyDoklad pom = new VypoctenyDoklad(cislo, 0, 0);
            if(doklady.contains(pom)){
                int cisloDokladu = doklady.indexOf(pom);
                System.out.println(doklady.get(cisloDokladu).toString());
            }else{
                System.out.println("Doklad nebyl nalezen");
            }
        }catch (Exception ex){
            System.out.println("Špatný formát dat. Doklad nelze změnit.");
        }
    }

    /**
     * Vyhledá doklady na základě vloženého měsíce a tyto doklady vypíše
     * @param doklady pole všech účetních dokladů
     */
    public static void vyhledatDokladByDate(LinkedList<VypoctenyDoklad> doklady){
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Zadejte číslo měsíce podle kterého chcete vyhledávat: ");
            int cislo = scan.nextInt();

            if(cislo >= 1 && cislo <= 12){
                compareListDoklady(doklady, cislo);
            }else{
                System.out.println("Měsíc s tímto číslem neexistuje.");
            }
        }catch (Exception ex){
            System.out.println("Špatný formát dat. Doklad nelze změnit.");
        }
    }

    private static void compareListDoklady(LinkedList<VypoctenyDoklad> doklady, int cislo) {
        boolean exists = false;
        for(VypoctenyDoklad doklad: doklady){
            Calendar cal = Calendar.getInstance();
            cal.setTime(doklad.datumVytvoreni);
            if (cal.get(Calendar.MONTH) + 1 == cislo) {
                System.out.println(doklad.toString());
                exists = true;
            }
        }
        if (!exists) {
            System.out.println("V tomto měsíci se žádný doklad nenachází.");
        }
    }

    /**
     * 
     * @param args
     * @throws FileNotFoundException vyjímka, když soubor nebude existovat
     * @throws IOException vyjímka, pokud doklady nelze zapsat do souboru
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        LinkedList<VypoctenyDoklad> doklady = new LinkedList<VypoctenyDoklad>();
        Scanner scan = new Scanner(System.in);
        int prom = 1;
        do{
            System.out.println("Zadejte cislo operace, kterou chcete provest:\n 1 - Novy doklad\n 2 - Uprava dokladu\n 3 - Vypis vsech dokladu\n 4 - Ulozeni dokladu do souboru ve formatu csv\n 5 - Vyhledat doklad podle cisla dokladu\n 6 - Vyhledat doklad podle mesice vlozeni\n 0 - KONEC");
            try{
                prom = scan.nextInt();
            }catch(Exception ex){
                System.out.println("Chyba při výběru položky.");
                prom = 0;
            }
            switch(prom){
                case 1:
                    VypoctenyDoklad doklad = novyDoklad();
                    if (doklad != null){
                        doklady.add(doklad);
                    }
                    break;
                case 2:
                    upravitDoklad(doklady);
                    break;
                case 3:
                    vypisDokladu(doklady);
                    break;
                case 4:
                    vypisDoSouboruCSV(doklady);
                    break;
                case 5:
                    vyhledatDoklad(doklady);
                    break;
                case 6:
                    vyhledatDokladByDate(doklady);
                    break;
                default:
                    if(prom != 0){
                        System.out.println("Volba neni k dispozici");
                    }
            }
        }while((prom > 0) || (prom < 0));
    }
}
