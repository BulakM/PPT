package ppt.cv6;

import java.io.*;

public class Main {

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
