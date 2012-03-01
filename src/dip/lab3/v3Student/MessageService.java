/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.v3Student;

/**
 *
 * @author knangle
 */
public class MessageService {
    
    private Reader messageIn;
    private Writer messageOut;
    
    
    
    public MessageService(Reader r, Writer w){
        this.messageIn=r;
        this.messageOut=w;
    }
    
    public void writeMessage(){
        messageOut.writeMessage(messageIn);
    }
    
}
