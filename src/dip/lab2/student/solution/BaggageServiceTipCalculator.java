
package dip.lab2.student.solution;

/**
 * @author Kevin
 */
public class BaggageServiceTipCalculator implements TipCalculator{
    
    private double baseTipPerBag;
    private double bagCount;
    private double goodRate = 0.20;
    private double fairRate = 0.15;
    private double poorRate = 0.10;

    private TipCalculator.ServiceQuality q;

    public BaggageServiceTipCalculator(TipCalculator.ServiceQuality q, double bags) {
        this.setServiceQuality(q); // perform validation
        this.setServiceAmount(bags);

        baseTipPerBag = 1.00; // set default value
    }
    
    public BaggageServiceTipCalculator(){
        baseTipPerBag = 1.00; // set default value
    }

    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(q) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + goodRate);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + fairRate);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + poorRate);
                break;
        }

        return tip;
    }

    public final void setServiceQuality(TipCalculator.ServiceQuality q) {
       
        this.q = q;
    }

    public TipCalculator.ServiceQuality getServiceQuality() {
        return q;
    }
//
    public double getServiceAmount() {
        return bagCount;
    }

    public final void setServiceAmount(double bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }
//
//    public double getBaseTipPerBag() {
//        return baseTipPerBag;
//    }
//
//    public void setBaseTipPerBag(double baseTipPerBag) {
//        if(baseTipPerBag < 0) {
//            throw new IllegalArgumentException(
//                    "error: base tip must be greater than or equal to zero");
//        }
//        this.baseTipPerBag = baseTipPerBag;
//    }
    
//    public void setServiceQualityGood() {
//        serviceQuality = ServiceQuality.GOOD;
//    }
//    public void setServiceQualityFair() {
//        serviceQuality = ServiceQuality.FAIR;
//    }
//    public void setServiceQualityPoor() {
//        serviceQuality = ServiceQuality.POOR;
//    }

}
