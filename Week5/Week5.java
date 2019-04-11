
// Programmer: Caleb Davidson 12110634 
// File: Week5.java
// Date: 24/3/2019
// Purpose: COIT11222 assignment one question five T119
// Take user input, calculate the cost and print a receipt with special pricing using message boxes and in a loop


import static java.lang.System.in;
import java.util.Scanner;
import javax.swing.JOptionPane;


class Week5
{
	
		 
	
	public static void main(String[] args) {
		System.out.println("                             Rocky Dry Cleaners Entry System");
		JOptionPane.showMessageDialog(null, "Welcome to Rocky Dry Cleaners Entry System");
		 final int N = 4;
		 double charge = 0;
		 int i = 0;
		 String customerName;
		 int numofgarments;
		 int totalGarments = 0;
		 double totalCharge = 0;

		

       
	   
	   while(i <= (N - 1))
{
		customerName = JOptionPane.showInputDialog(null, "Please enter the customer name " + (i + 1));
                numofgarments = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of garments for " + customerName));
               
				
				totalGarments = totalGarments + numofgarments;
				
				charge = calculateCharge(numofgarments);
				totalCharge = totalCharge + charge;
				
				JOptionPane.showMessageDialog(null, String.format("%s\n%s\n%s\n%s","---Receipt---", "Customer name: " + customerName, "Number of garments: " + numofgarments, "Total charge: $" + charge));
				
				
                
				i++;
				
}


		
JOptionPane.showMessageDialog(null, String.format("%s\n%s", "The average number of garments is: " + (totalGarments / N), "The total charges collected is $" + totalCharge));
		
	}
	
	private static double calculateCharge(int garment)
	{
		final double price = 8.50;
		 final double threeGarments = 20.00;
		 final double morethanthreegarments = 6.50;
		 double charge = 0;
	 
				if (garment >= 2)
				{
					charge = garment * price;
				}
				if (garment == 3)
				{
					charge = threeGarments;
				}
				
				if (garment > 3)
				{
					charge = threeGarments + ((garment -3) * morethanthreegarments);
				}
	
	
return charge;	
	}
	
}