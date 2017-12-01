/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppt;

import java.io.*;
/**
 *
 * @author kremla02
 */
public class cv7 {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {
        // write your code here
        System.out.println("Nacist cisla ze vstupu (0) nebo ze souboru (1): ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DataProcessing dp = new DataProcessing();
        try {
            switch (br.readLine()) {
                case "0": {
                    dp.Process1();
                    break;
                }
                case "1": {
                    dp.Process2();
                    break;
                }
                default: {
                    System.out.println("Neznama moznost");
                }
            }
        } catch (IOException e) {
            System.out.println("Neznama moznost");
        }
    }
}
