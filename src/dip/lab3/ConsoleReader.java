/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class ConsoleReader implements Reader {
    
    private String input;
    
    Scanner consoleReader = new Scanner(System.in);
    
    public ConsoleReader(){}
    
    public void readMessage(){
        System.out.println("Please enter the text of your message:");
        setInput(consoleReader.nextLine());      
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public void messageReader() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
