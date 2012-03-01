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
public class GUIWriter implements Writer{
    
    private String output;
    
    public GUIWriter(){}
    
    public void writeMessage(){
       JOptionPane.showMessageDialog(null, output);
    }
    
    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public void messageWriter() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
