/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution;

/**
 *
 * @author Kevin
 */
public interface TipCalculator {
    public static enum ServiceQuality {
        GOOD, FAIR, POOR
    }
    
    public abstract double getTip();             // Returns the suggested tip amount
//    public abstract void setServiceAmount(double amt);// Provides a quantity/amount of service
                                             // provided
//    public abstract void setServiceQualityGood(); // Sets ServiceQuality enum to GOOD
//    public abstract void setServiceQualityFair(); // Sets ServiceQuality enum to FAIR
//    public abstract void setServiceQualityPoor(); // Sets ServiceQuality enum to POOR
}
