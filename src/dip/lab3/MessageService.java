/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

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
            
     public MessageService(){}
     
     public String getInputString(){
         return inputObject.getInput();
     }
     
      public String getOutputString(){
         return outputObject.getOutput();
     }
     
     public void getMessage(){
         inputObject.messageReader();
     }
     
     public void displayMessage(){
         outputObject.setOutput(getInputString());
         outputObject.messageWriter();
     }

    public Reader getInputMessage() {
        return inputObject;
    }

    public void setInputMessage(Reader inputMessage) {
        this.inputObject = inputMessage;
    }

    public Writer getOutputMessage() {
        return outputObject;
    }

    public void setOutputMessage(Writer outputMessage) {
        this.outputObject = outputMessage;
    }
     
}
