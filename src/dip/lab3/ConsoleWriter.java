/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author Kevin
 */
public class ConsoleWriter implements Writer{
    
    private String output;
    
    public ConsoleWriter(){}
    
    public void writeMessage(){
        System.out.println(getOutput());
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
