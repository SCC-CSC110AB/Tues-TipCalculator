package tues.tipcalculator;

import java.util.Scanner;

/**
 *
 * @author john
 */
public class TuesTipCalculator {
    
    public static final String SERVER_NAME_QUESTION 
            = "What was your servers name? ";
    
    public static final String BILL_QUESTION
            = "How much was your bill? ";

    public static final String HOW_WAS_SERVICE_QUESTION
            = "How was your service? ";
    
    public static final float SALES_TAX = 0.06F;
    
    public static final float BAD_SERVICE_TIP = 0;
    public static final float GOOD_SERVICE_TIP = 0.2F;
    public static final float GREAT_SERVICE_TIP = 0.3F;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String serverName;
        String serviceQuality;
        double billAmount;
        double billWithTaxAmount;
        double tipAmount;
        double finalBillAmount;
        
        System.out.print(SERVER_NAME_QUESTION);
        serverName = input.nextLine();
        
        
        System.out.print(HOW_WAS_SERVICE_QUESTION);
        serviceQuality = input.nextLine();
               
        System.out.print(BILL_QUESTION);
        billAmount = input.nextDouble();
        
        billWithTaxAmount = billAmount + (billAmount * SALES_TAX);
        
        // This would work as well
        //billWithTaxAmount = billAmount * (1 + SALES_TAX);
        
        if (serviceQuality.equalsIgnoreCase("bad")) {
            tipAmount = billWithTaxAmount * BAD_SERVICE_TIP;
        } else if (serviceQuality.equalsIgnoreCase("good")) {
            tipAmount = billWithTaxAmount * GOOD_SERVICE_TIP;
        } else {
            tipAmount = billWithTaxAmount * GREAT_SERVICE_TIP;
        }
        
        finalBillAmount = billWithTaxAmount + tipAmount;
        
//        System.out.println("Your server " 
//                + serverName 
//                + " will get a tip of " 
//                + tipAmount
//                + " and your final bill will be "
//                + finalBillAmount
//        );

        System.out.printf(
                "Your server %s " 
                + "will get a tip of $%.2f "
                + "and your final bill will be $%.2f\n",
                serverName,
                tipAmount,
                finalBillAmount
        );
    }
}
