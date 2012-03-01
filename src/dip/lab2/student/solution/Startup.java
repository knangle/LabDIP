package dip.lab2.student.solution;

// An useful import if you need it.
import java.text.NumberFormat;
import java.util.Scanner;
// Another useful import if you need it.
import javax.swing.JOptionPane;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author your name goes here
 */
public class Startup {

    public static void main(String[] args) {
        
        int serviceType = 0;
        double serviceQty = 0;
        int serviceLevel = 0;
        TipCalculator thisTip = null;
        
        
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        Scanner selection = new Scanner(System.in);
        
        System.out.println("Please choose the service type:");
        System.out.println("");
        System.out.println("Restaurant wait service (1):");
        System.out.println("Baggage service (2):");
        serviceType = selection.nextInt();
        
        if (serviceType == 1){
            System.out.println("");
            System.out.println("Please enter the bill amount:");
            serviceQty = selection.nextDouble();
        }
        else{
            System.out.println("");
            System.out.println("Please enter the number of bags:");
            serviceQty = selection.nextInt();
        }
        
        System.out.println("");
        System.out.println("Please enter the service quality:");
        System.out.println("Good (1)");
        System.out.println("Fair (2)");
        System.out.println("Poor (3)");
        serviceLevel = selection.nextInt();
            
            TipCalculator tip1 = new FoodServiceTipCalculator(TipCalculator.
            ServiceQuality.GOOD,serviceQty);
          
            TipCalculator tip2 = new FoodServiceTipCalculator(TipCalculator.
            ServiceQuality.FAIR,serviceQty);
          
            TipCalculator tip3 = new FoodServiceTipCalculator(TipCalculator.
            ServiceQuality.POOR,serviceQty);
          
            TipCalculator tip4 = new BaggageServiceTipCalculator(TipCalculator.
            ServiceQuality.GOOD,serviceQty);
          
            TipCalculator tip5 = new BaggageServiceTipCalculator(TipCalculator.
            ServiceQuality.FAIR,serviceQty);
            
            TipCalculator tip6 = new BaggageServiceTipCalculator(TipCalculator.
            ServiceQuality.POOR,serviceQty);
        
        if (serviceType == 1){
            switch (serviceLevel){
                case 1:
                    thisTip = tip1;
                    break;
                case 2:
                    thisTip = tip2;
                    break;
                case 3:
                    thisTip = tip3;
                    break;
            }       
        }
        if (serviceType ==2){
            switch (serviceLevel){
                case 1:
                    thisTip = tip4;
                    break;
                case 2:
                    thisTip = tip5;
                    break;
                case 3:
                    thisTip = tip6;
                    break;
            }
        }   
        TipService smartTipper = new TipService(thisTip);
            
       // smartTipper.setCalc(thisTip);
            System.out.println("");
            System.out.println("The appropriate tip is " 
                    + nf.format(smartTipper.getTip()));
    }

}
    


