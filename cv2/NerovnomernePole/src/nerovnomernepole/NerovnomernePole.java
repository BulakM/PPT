/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nerovnomernepole;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author user
 */
public class NerovnomernePole {
    
    public static final int MIN_POLE = 5;       // Minimální počet polí(prvků) 
    public static final int MAX_POLE = 25;      // Maximální počet polí(prvků)
    public static final int MAX_VALUE = 1000;   // Maximální hodnota v poli
    
    public static ArrayList<ArrayList<Integer>> generate2DPole(){
        ArrayList<ArrayList<Integer>> pole = new ArrayList<ArrayList<Integer>>();
        Random random = new Random();
        int rows = random.nextInt((MAX_POLE - MIN_POLE) + 1) + MIN_POLE;
        for(int i = 0; i < rows; i++){
            int columns = random.nextInt((MAX_POLE - MIN_POLE) + 1) + MIN_POLE;
            ArrayList<Integer> radek = new ArrayList<Integer>();
            for(int j = 0; j < columns; j++){
                radek.add(random.nextInt(MAX_VALUE));
            }
            pole.add(radek);
        }
        return pole;
    }
    
    public static String vypisPole(ArrayList<ArrayList<Integer>> pole){
        String result = "";
        for (int i = 0; i < pole.size(); i++) {
            for (int j = 0; j < pole.get(i).size(); j++) {
                result += pole.get(i).get(j) + "\t";
            }
            result += "\n";
        }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println("Generování pole\n---------------\n2D pole je generováno vždy jiným způsobem. \nPřed definicí programu jsou definovány konstanty pro minimální rozměr a maximální rozměr pole a také konstanta pro maximální hodnotu v poli.\n");
        ArrayList<ArrayList<Integer>> pole = NerovnomernePole.generate2DPole();
        System.out.println(NerovnomernePole.vypisPole(pole));
    }
}
