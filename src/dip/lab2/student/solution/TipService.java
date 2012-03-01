/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution;

import dip.lab1.student.solution1.Employee;

/**
 *
 * @author Kevin
 */
public class TipService {
    
    private TipCalculator calc;
    
    public TipService(TipCalculator calc){
        this.calc = calc;
    }
    /**
     * @return the suggested tip amount
     */
     public double getTip(){
        
        return calc.getTip();
}
     
    public void setCalc(TipCalculator calc) {
        this.calc = calc;
    }
}

