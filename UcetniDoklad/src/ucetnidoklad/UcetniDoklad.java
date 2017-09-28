/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucetnidoklad;

public class UcetniDoklad {

    public int cisloDokladu;
    public float celkemBezDph;
    public int procentoDph;

    public UcetniDoklad(int cisloDokladu, float celkemBezDph, int procentoDph){
        this.cisloDokladu = cisloDokladu;
        this.celkemBezDph = celkemBezDph;
        this.procentoDph = procentoDph;
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

    public int getProcentoDph() {
        return procentoDph;
    }

}
