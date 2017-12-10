/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv11a4;

/**
 *
 * @author lukas
 */
public class Viewer {
    public void ShowMessage(Messanger message){
        for (int i = 0; i < message.repeat; i++) {
            System.out.println(message.mess + " " + message.num);
        }
    }
}
