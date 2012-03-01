/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class GUIReader implements Reader{
    
    private String input;
    
    public GUIReader(){}
    
    public void readMessage(){
        input = JOptionPane.showInputDialog("Please enter the text of your message:");  
        
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
