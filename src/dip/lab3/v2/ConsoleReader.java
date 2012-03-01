/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.v2;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class ConsoleReader implements Reader {
    
    public ConsoleReader(){}
    
    public String readMessage(){
        Scanner consoleReader = new Scanner(System.in);
        System.out.println("Please enter the text of your message:");
        return consoleReader.nextLine();      
    }


    
}
