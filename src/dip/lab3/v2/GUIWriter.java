/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.v2;

import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class GUIWriter implements Writer{
    

    
    public void writeMessage(Reader reader){
       JOptionPane.showMessageDialog(null, reader.readMessage());
    }
    

    
}
