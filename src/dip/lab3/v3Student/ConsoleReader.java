/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.v3Student;

import java.util.Scanner;


/**
 *
 * @author knangle
 */
public class ConsoleReader implements Reader{
    
    Scanner input = new Scanner(System.in);
    
    public String readMessage() {
        
        System.out.println("Please enter the text of your message:");
        
        return input.nextLine();
    } 
    
}
