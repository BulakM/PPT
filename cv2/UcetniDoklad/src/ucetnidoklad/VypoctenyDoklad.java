package ucetnidoklad;

/**
 * 
 * Třída obsluhující operace na účetním dokladem
 * @author tym2
 */

public class VypoctenyDoklad extends UcetniDoklad{

    
    private float dph;
    private float celkemSDph;

    
    /**
     * 
     * Konstruktor, který vytvoří vypočtený doklad
     * @param cisloDokladu Každý doklad má své jedinečné číslo
     * @param celkemBezDph Celková cena bez daně
     * @param procentoDph  Procentuální hodnota daně
     */
    public VypoctenyDoklad(int cisloDokladu, float celkemBezDph, int procentoDph){
        super(cisloDokladu, celkemBezDph, procentoDph);
        this.dph = this.celkemBezDph * procentoDph / 100;
        this.celkemSDph = this.celkemBezDph + this.dph;
    }

    /**
     * 
     * Getter položky dph
     * @return Vrátí procentuální hodnotu dph
     */
    public float getDph() {
        return dph;
    }

    /**
     * 
     * Getter položky celkemSDph
     * @return Vrátí hodnotu celkové ceny s dph
     */
    public float getCelkemSDph() {
        return celkemSDph;
    }

    /**
     * 
     * Zabezpečuje konzistentnost dat, jakmile se změní nějaký údaj doklad se přepočítá
     */
    private void prepocitatDoklad(){
        this.dph = this.celkemBezDph * this.procentoDph / 100;
        this.celkemSDph = this.celkemBezDph + this.dph;
    }

    /**
     * 
     * Setter celkové ceny bez dph
     * @param celkemBezDph Celková cena bez dph
     */
    public void setCelkemBezDph(float celkemBezDph) {
        this.celkemBezDph = celkemBezDph;
        this.prepocitatDoklad();
    }

    /**
     * 
     * Setter hodnoty dph
     * @param procentoDph Procentuální hodnota dph
     */
    public void setProcentoDph(int procentoDph) {
        this.procentoDph = procentoDph;
        this.prepocitatDoklad();
    }

    /**
     * Metoda pro výpis dokladu
     * @return Vrátí všechny údaje o daňovém dokladu - číslo dokladu, cenu bez DPH, procentuální hodnotu DPH, hodnotu DPH v Kč, celková cena s dph 
     */
    @Override
    public String toString(){
        return "Datum vytvoreni: " + this.getDatumVytvoreni() + ", Cislo dokladu: " + this.cisloDokladu + ", celkem bez DPH: " + this.celkemBezDph + ", (DPH: " + this.procentoDph + " % = " + this.dph + " Kč), celkem s DPH: " + this.celkemSDph + " Kč";
    }
    
    /**
     * Metoda pro porovnání dokladů
     * @return Vrátí, zda se dva doklady (respektive čísla dokladů) rovnají
     */
    @Override
    public boolean equals(Object obj){
        if (obj == null)
            return false;
        if (obj instanceof VypoctenyDoklad == false)
            return false;
        return cisloDokladu == ((VypoctenyDoklad)obj).cisloDokladu;
    }
    
    /**
     * Hashovací funkce nutná pro chod programu
     * @return Vždy vrací 1
     */
    @Override
    public int hashCode() {
        return 1;
    }
}
