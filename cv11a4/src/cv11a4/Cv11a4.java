/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv11a4;

import java.util.Scanner;
/**
 *
 * @author lukas
 */
public class Cv11a4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Zadejte text:");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        String n = reader.nextLine();
        System.out.println("Zadejte cislo:");
        int i = reader.nextInt();
        System.out.println("Kolikrat se ma zprava opakovat");
        int y = reader.nextInt();
        reader.close();

        Messanger m = new Messanger(n,i,y);
        Viewer v = new Viewer();
        v.ShowMessage(m);        
    }
    
}
