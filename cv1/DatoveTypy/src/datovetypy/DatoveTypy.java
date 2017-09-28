/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datovetypy;

/**
 *
 * @author user
 */
public class DatoveTypy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Název\t\tVelikost\tMin. hodnota\t\tMax. hodnota");
        System.out.println("Byte\t\t" + Byte.SIZE + "\t\t" + Byte.MIN_VALUE + "\t\t\t" + Byte.MAX_VALUE);
        System.out.println("Short\t\t" + Short.SIZE + "\t\t" + Short.MIN_VALUE + "\t\t\t" + Short.MAX_VALUE);
        System.out.println("Integer\t\t" + Integer.SIZE + "\t\t" + Integer.MIN_VALUE + "\t\t" + Integer.MAX_VALUE);
        System.out.println("Long\t\t" + Long.SIZE + "\t\t" + Long.MIN_VALUE + "\t" + Long.MAX_VALUE);
        System.out.println("Float\t\t" + Float.SIZE + "\t\t" + Float.MIN_VALUE + "\t\t\t" + Float.MAX_VALUE);
        System.out.println("Double\t\t" + Double.SIZE + "\t\t" + Double.MIN_VALUE + "\t\t" + Double.MAX_VALUE);
        System.out.println("Character\t" + Character.SIZE + "\t\t" + (int)Character.MIN_VALUE + "\t\t\t" + (int)Character.MAX_VALUE);
        System.out.println("Boolean\t\t" + "1" + "\t\t" + Boolean.FALSE + "\t\t\t" + Boolean.TRUE);
        System.out.println("Diskuze");
        System.out.println("Je dobre uvažovat o tom, jaká data budeme ukládat například, když víme že budeme ukládat číslo do 1 000 000 použijeme integer s velikostí 32 bitů a ne long s velikostí 64 bitů");
        System.out.println("Tímto zrychlíme práci s programy a ušetříme paměť");
    }
    
}
