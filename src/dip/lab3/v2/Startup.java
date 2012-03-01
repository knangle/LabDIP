/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.v2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Reader reader = new GUIReader();
//        GUIReader msg2 = new GUIReader();
       Writer writer = new GUIWriter();
//        GUIWriter out2 = new GUIWriter();
        
        MessageService serv = new MessageService(reader, writer);
        serv.produceMessage();
       
            
        
    }
}
