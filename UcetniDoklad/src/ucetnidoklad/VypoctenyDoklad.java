package ucetnidoklad;

public class VypoctenyDoklad extends UcetniDoklad{

    private float dph;
    private float celkemSDph;

    public VypoctenyDoklad(int cisloDokladu, float celkemBezDph, int procentoDph){
        super(cisloDokladu, celkemBezDph, procentoDph);
        this.dph = this.celkemBezDph * procentoDph / 100;
        this.celkemSDph = this.celkemBezDph + this.dph;
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

    public void setCelkemBezDph(float celkemBezDph) {
        this.celkemBezDph = celkemBezDph;
        this.prepocitatDoklad();
    }

    public void setProcentoDph(int procentoDph) {
        this.procentoDph = procentoDph;
        this.prepocitatDoklad();
    }

    @Override
    public String toString(){
        return "Cislo dokladu: " + this.cisloDokladu + ", celkem bez DPH: " + this.celkemBezDph + ", (DPH: " + this.procentoDph + " % = " + this.dph + " Kč), celkem s DPH: " + this.celkemSDph + " Kč";
    }
}
