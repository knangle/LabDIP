/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.v2;

/**
 *
 * @author Kevin
 */
public class ConsoleWriter implements Writer{
    

    
    public void writeMessage(Reader reader){
        System.out.println(reader.readMessage());
    }
    

    
}
