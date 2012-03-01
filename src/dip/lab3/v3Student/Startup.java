/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.v3Student;

import dip.lab3.*;
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
       Reader inputMethod;
       Writer outputMethod;
        
       Reader msg1 = new ConsoleReader(); 
       Reader msg2 = new GUIReader();
       Writer out1 = new ConsoleWriter();
       Writer out2 = new GUIWriter();
        
       Scanner choice = new Scanner(System.in);
                    
           System.out.println("How do you want to provide input? (G)UI or "
                    + "(C)onsole?");
            userInput = choice.nextLine();
                while (!userInput.equals("G") && !userInput.equals("C")){
                    System.out.println("Please select 'G' or 'C'.");
                    userInput = choice.nextLine();
                }
            if (userInput.equals("C"))
                inputMethod = msg1;
            else
                inputMethod = msg2;
            
            System.out.println("How do you want to display output? (G)UI or "
                    + "(C)onsole?");
            userOutput = choice.nextLine();
                while (!userInput.equals("G") && !userInput.equals("C")){
                    System.out.println("Please select 'G' or 'C'.");
                    userInput = choice.nextLine();
                }
            if (userOutput.equals("C"))
                outputMethod = out1;
            else
                outputMethod = out2;
 
      MessageService serv1 = new MessageService(inputMethod, outputMethod);
      serv1.writeMessage(); 
        
    }
}
