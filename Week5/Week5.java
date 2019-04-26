
// Programmer: Caleb Davidson 12110634 
// File: Week5.java
// Date: 24/3/2019
// Purpose: COIT11222 assignment one question five T119
// Take user input, calculate the cost and print a receipt with special pricing using message boxes and in a loop


import static java.lang.System.in;//import for input stream
import java.util.Scanner; //imports the scanner object
import javax.swing.JOptionPane;//import for the popup boxes


class Week5//class for week 5
{
	
		 
	
	public static void main(String[] args) {//main method
		System.out.println("                             Rocky Dry Cleaners Entry System");//prints the title
		JOptionPane.showMessageDialog(null, "Welcome to Rocky Dry Cleaners Entry System");//popup a welcome message
		 final int N = 6; // stores the largest didgit in id
		 double charge = 0;// stores the default value for charge
		 int i = 0; //initiates the loop counter
		 String customerName;//stores the customers name
		 int numofgarments;// stores the number of garments for the customer
		 int totalGarments = 0;//stores the total garments collected
		 double totalCharge = 0;//stores the total charged

		

       
	   
	   while(i <= (N - 1))//while i is less or equal to n - 1 (-1 cause i starts at 0 so the 6th count is actually 5
{
		customerName = JOptionPane.showInputDialog(null, "Please enter the customer name " + (i + 1));//i keeps track of the current person and the loop count uses input popup to store customer name in customername
                numofgarments = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of garments for " + customerName));//stores number of garments using input popup in variable numofgarments
               
				
				totalGarments = totalGarments + numofgarments;//adds numofgarments to the running total, totalGarments
				
				charge = calculateCharge(numofgarments);//uses the method calculateCharge to process and return a value for charge while parsing numofgarments as a parameter
				totalCharge = totalCharge + charge;//adds charge to the running total, totalCharge
				
				JOptionPane.showMessageDialog(null, String.format("%s\n%s\n%s\n%s$%.2f","---Receipt---", "Customer name: " + customerName, "Number of garments: " + numofgarments, "Total charge: " , charge));//prints out receipt with formatting code
				
				
                
				i++;//increases i by 1
				
}//end of loop


		
JOptionPane.showMessageDialog(null, String.format("%s\n%s$%.2f", "The average number of garments is: " + (totalGarments / N), "The total charges collected is " , totalCharge));// prints the totals and averages
		
	}//end main
	
	private static double calculateCharge(int garment)// method to calculate charge it takes a parameter called garment and is a private method
	{
		final double price = 8.50; //stores price of garments
		 final double threeGarments = 20.00;//stores price for 3 garments
		 final double morethanthreegarments = 6.50;//stores price for more than 3 garments
		 double charge = 0;//stores the default charge value 0
	 
				if (garment >= 2)//if number of garments is less than or equal to 2 use normal pricing
				{
					charge = garment * price;
				}
				if (garment == 3)//if number of garments are equal to 3 use the threegarments price
				{
					charge = threeGarments;
				}
				
				if (garment > 3)// if number of garments is larger than 3
				{
					charge = threeGarments + ((garment -3) * morethanthreegarments);
				}
	
	
return charge;	//returns the charge
	}//end calculateCharge method
	
}//end class