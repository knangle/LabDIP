/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.v3Student;

/**
 *
 * @author knangle
 */
public class ConsoleWriter implements Writer{

    public void writeMessage(Reader readMe) {
        System.out.println(readMe.readMessage());
    }
    
}
