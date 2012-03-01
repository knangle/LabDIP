package dip.lab1.student.solution1;

import javax.swing.JOptionPane;

/**
 * A high-level class that delegates to employee objects to do the work. Does
 * this class design follow the DIP? If not, fix it.
 *
 * @author knangle
 */
public class HRService {
    
//    private Employee employee;  // Declares a variable "employee" of the Employee type (neither hourly nor salaried)
//    
//    
//    public HRService(Employee e)// This constructor creates an instance of an Employee and assigns it to the employee variable
//    {
//    this.employee = e;
//    }
//    
//    public HRService(){}  // Default constructor - THIS IS THE ONE USED BY MY STARTUP
    /**
     * @return the annualCompensationForEmployee
     */
     public double getAnnualCompensationForEmployee(Employee employee) // This method is called by Startup.  Startup sends an Employee,
                                                                // either salaried or hourly (doesn't matter which because
                                                                // they're both Employees and both have a getAnnualWages
                                                                // method). 
     {
        return employee.getAnnualWages();                          // Run the getAnnualWages method for  Employee "e" from above.
     }                                                      // The Employee is either hourly or salaried, and it knows which one
                                                            // it is, so the correct formula is applied.  The parameters passed
//      public void setEmloyee(Employee e) {
//              employee = e;// from Startup are evaluated using the appropriate formula 
//        }                                 // (depending on the sub-class of the Employee) and the result is 
                                                            // returned to Startup
     
}
