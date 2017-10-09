/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucetnidoklad;

/**
 * 
 * @author tym2
 * trida 
 */

public class UcetniDoklad {
    
    public int cisloDokladu;
    public float celkemBezDph;
    public int procentoDph;

    /**
     * 
     * @param cisloDokladu Jedinečné číslo dokladu
     * @param celkemBezDph Celková cena bez dph
     * @param procentoDph Procentuální hodnota dph
     */
    public UcetniDoklad(int cisloDokladu, float celkemBezDph, int procentoDph){
        this.cisloDokladu = cisloDokladu;
        this.celkemBezDph = celkemBezDph;
        this.procentoDph = procentoDph;
    }

    /**
     * Getter pro číslo dokladu
     * @return  Vrátí číslo dokladu
     */
    public int getCisloDokladu() {
        return cisloDokladu;
    }

    /**
     * Setter pro číslo dokladu
     * @param cisloDokladu Jedinečné číslo dokladu
     */
    public void setCisloDokladu(int cisloDokladu) {
        this.cisloDokladu = cisloDokladu;
    }

    /**
     * Getter pro cenu bez dph
     * @return Vrátí cenu bez dph
     */
    public float getCelkemBezDph() {
        return celkemBezDph;
    }

    /**
     * Getter pro dph
     * @return Vrátí procentuální hodnotu dph
     */
    public int getProcentoDph() {
        return procentoDph;
    }

}
