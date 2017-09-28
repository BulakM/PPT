/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucetnidoklad;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class UcetniDoklad {

    public int cisloDokladu;
    public float celkemBezDph;
    public int procentoDph;
    private float dph;
    private float celkemSDph;
    
    public UcetniDoklad(int cisloDokladu, float celkemBezDph, int procentoDph){
        this.cisloDokladu = cisloDokladu;
        this.celkemBezDph = celkemBezDph;
        this.procentoDph = procentoDph;
        this.dph = this.celkemBezDph * procentoDph / 100;
        this.celkemSDph = this.celkemBezDph + this.dph;
    }

    public int getCisloDokladu() {
        return cisloDokladu;
    }

    public void setCisloDokladu(int cisloDokladu) {
        this.cisloDokladu = cisloDokladu;
    }

    public float getCelkemBezDph() {
        return celkemBezDph;
    }

    public void setCelkemBezDph(float celkemBezDph) {
        this.celkemBezDph = celkemBezDph;
        this.prepocitatDoklad();
    }

    public int getProcentoDph() {
        return procentoDph;
    }

    public void setProcentoDph(int procentoDph) {
        this.procentoDph = procentoDph; 
        this.prepocitatDoklad();
    }

    public float getDph() {
        return dph;
    }

    public float getCelkemSDph() {
        return celkemSDph;
    }
    
    private void prepocitatDoklad(){
        this.dph = this.celkemBezDph * this.procentoDph / 100;
        this.celkemSDph = this.celkemBezDph + this.dph;
    }
    
    @Override
    public String toString(){
        return "Cislo dokladu: " + this.cisloDokladu + ", celkem bez DPH: " + this.celkemBezDph + ", (DPH: " + this.procentoDph + " % = " + this.dph + " Kč), celkem s DPH: " + this.celkemSDph + " Kč";
    }
    
    public static UcetniDoklad novyDoklad(int cisloDokladu){
        Scanner scan = new Scanner(System.in);
        System.out.println("Zadejte cenu bez DPH: ");
        try{
            float cena = scan.nextFloat();
            System.out.println("Zadejte procento DPH: ");
            int dph = scan.nextInt();
            UcetniDoklad doklad = new UcetniDoklad(cisloDokladu, cena, dph);
            return doklad;
        }catch (Exception ex){
            System.out.println("Špatný formát dat. Doklad nebyl uložen.");
        }
        return null;
    }
    
    public static void vypisDokladu(UcetniDoklad doklady[], int pocet){
        System.out.println("Vypis vsech dokladu");
        for (int i = 0; i < pocet -1; i++) {
            System.out.println(doklady[i].toString());
        }
    }
    
    public static void vypisDoSouboruCSV(UcetniDoklad doklady[], int pocet) throws FileNotFoundException, IOException{
        FileWriter fw = new FileWriter("doklady.csv", false);
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
    }
    
    public static void upravitDoklad(UcetniDoklad doklady[], int cisloDokladu){
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
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        UcetniDoklad[] doklady = new UcetniDoklad[100];
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
                    UcetniDoklad doklad = novyDoklad(cisloDokladu);
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
