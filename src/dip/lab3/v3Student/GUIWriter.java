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
public class GUIWriter implements Writer{

    public void writeMessage(Reader readMe) {
        JOptionPane.showMessageDialog(null, readMe.readMessage());
    }
    
}
