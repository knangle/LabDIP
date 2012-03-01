package dip.lab2.student.solution;

/**
 *
 * @author Kevin
 */
public class FoodServiceTipCalculator implements TipCalculator{
    
    private final double MIN_BILL = 0.00;
    private final String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + MIN_BILL;
    private double goodRate = 0.20;
    private double fairRate = 0.15;
    private double poorRate = 0.10;
    private TipCalculator.ServiceQuality q;
    private double billAmt;

    public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        this.q = q;
        this.billAmt = billAmt;
    }
    
    

    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(q) {
            case GOOD:
                tip = billAmt * goodRate;
                break;
            case FAIR:
                tip = billAmt * fairRate;
                break;
            case POOR:
                tip = billAmt * poorRate;
                break;
        }

        return tip;
    }

//    public final void setServiceAmount(double billAmt) {
//        if(billAmt < MIN_BILL) {
//            throw new IllegalArgumentException(BILL_ENTRY_ERR);
//        }
//        bill = billAmt;
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
//
    public final void setServiceQuality(TipCalculator.ServiceQuality q) {
        // No need to validate because enums provide type safety!
        this.q = q;
    }

    public TipCalculator.ServiceQuality getServiceQuality() {
        return q;
    }

    public double getBillAmt() {
        return billAmt;
    }

    public void setBillAmt(double billAmt) {
        this.billAmt = billAmt;
    }
    
}
