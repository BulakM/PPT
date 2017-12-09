/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Jiří Klusáček
 */
public class Singleton {
    
    private static Singleton instance;
    private String text;
    
    private Singleton(String text){
        this.text = text;
    }
    
    public static Singleton getInstance(String text){
        if (instance == null){
            System.out.println("Byla vytvořena nová instance.");
            instance = new Singleton(text);
        }else{
            System.out.println("Nelze vytvořit novou instanci, protože instance již existuje.");
        }
        return instance;
    }
    
    @Override
    public String toString(){
        return "Text uložený v singleton: " + this.text;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Vytvoření první instance s názvem objekt:\n-----------------------------------------");
        Singleton objekt = Singleton.getInstance("První singleton");
        System.out.println(objekt.toString() + "\n");
        System.out.println("Vytvoření druhé instance s názvem objekt2:\n------------------------------------------");
        Singleton objekt2 = Singleton.getInstance("Druhý singleton");
        System.out.println(objekt2.toString() + "\n");
    }
}
