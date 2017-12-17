
package iterator;

//Testovací třída
public class Main {
    public static void main(String[] args) {
        // Vytvoření pole s předdefinovanými daty
        JmenaPole jmenaPole = new JmenaPole();
        //Získání správného iterátoru
        System.out.println("Získání správného iterátoru pro pole a výpis dat:");
        for(Iterator iterator = jmenaPole.getIterator(); iterator.hasNext();){
         String jmeno = (String)iterator.next();
         System.out.println("Jméno: " + jmeno);
        } 
        System.out.println();
        // Vytvoření seznamu a vložení dat
        JmenaSeznam jmenaSeznam = new JmenaSeznam();
        jmenaSeznam.addItem("Jana");
        jmenaSeznam.addItem("Petr");
        jmenaSeznam.addItem("Ivana");
        //Získání správného iterátoru
        System.out.println("Získání správného iterátoru pro seznam a výpis dat:");
        for(Iterator iterator2 = jmenaPole.getIterator(); iterator2.hasNext();){
         String jmeno = (String)iterator2.next();
         System.out.println("Jméno: " + jmeno);
        } 
        System.out.println();
    }
}
