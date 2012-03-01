/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.v3Student;

import javax.swing.JOptionPane;

/**
 *
 * @author knangle
 */
public class GUIReader implements Reader {

    public String readMessage() {
        
        return JOptionPane.showInputDialog("Please enter the text of your message:"); 
    }   
}
    