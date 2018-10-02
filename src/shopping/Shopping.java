/*
 * Created by Misha Donais
 * Created on October 2nd 2018
 * To calculate the cost of a number of purchased items
 */

package shopping;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author midon7419
 */
public class Shopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //Scanner
       Scanner keyedInput = new Scanner(System.in);
       //2 decimals
       DecimalFormat x = new DecimalFormat ("### ###.##");
        
       //variable declaration
       final double USBPRICE = 19.99;
       final double KEYBOARDPRICE = 49.99;
       final double MOUSEPRICE = 25.99;
       final double TAX = 1.13;
       
       //Prompts and inputs
       //USB
       System.out.println("Enter the number of USB devices you would like to purchase");
       double numberOfUSBs = keyedInput.nextDouble();
       //Keyboard
       System.out.println("Enter the number of keyboards you would like to purchase");
       double numberOfKeyboards = keyedInput.nextDouble();
       //Mouse
       System.out.println("Enter the number of mice you would like to purchase");
       double numberOfMice   = keyedInput.nextDouble();
       
       //Calculations
       double totalCost = ((numberOfUSBs*USBPRICE) + (numberOfKeyboards*KEYBOARDPRICE) + (numberOfMice*MOUSEPRICE))*TAX;
       
       //Ouptut
        System.out.println("Your total bill will be " + (x.format(totalCost)));
    }
    
}
