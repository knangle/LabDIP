/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

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
        
        String userInput = "";
        String userOutput = "";
        
        ConsoleReader msg1 = new ConsoleReader();
        GUIReader msg2 = new GUIReader();
        ConsoleWriter out1 = new ConsoleWriter();
        GUIWriter out2 = new GUIWriter();
        
        MessageService Serv1 = new MessageService();
        
        Scanner choice = new Scanner(System.in);
        
        
           System.out.println("How do you want to provide input? (G)UI or "
                    + "(C)onsole?");
            userInput = choice.nextLine();
                while (!userInput.equals("G") && !userInput.equals("C")){
                    System.out.println("Please select 'G' or 'C'.");
                    userInput = choice.nextLine();
                }
            if (userInput.equals("C"))
                Serv1.setInputMessage(msg1);
            else
                Serv1.setInputMessage(msg2);
            
            Serv1.getMessage();
            
            System.out.println("How do you want to display output? (G)UI or "
                    + "(C)onsole?");
            userOutput = choice.nextLine();
                while (!userInput.equals("G") && !userInput.equals("C")){
                    System.out.println("Please select 'G' or 'C'.");
                    userInput = choice.nextLine();
                }
            if (userOutput.equals("C"))
                Serv1.setOutputMessage(out1);
            else
                Serv1.setOutputMessage(out2);
            
            Serv1.displayMessage();
            
        
    }
}
