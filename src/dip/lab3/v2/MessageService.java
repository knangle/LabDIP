/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.v2;

/**
 *
 * @author Kevin
 */
public class MessageService {
    
    private Reader inputObject;
    private Writer outputObject;
    
    public MessageService(Reader input, Writer output){
        this.inputObject = input;
        this.outputObject = output;
    }
     
    public void produceMessage() {
        outputObject.writeMessage(inputObject);
    }
}
