// Programmer: Caleb Davidson 12110634 
// File: Week4.java
// Date: 24/3/2019
// Purpose: COIT11222 assignment one question four T119
// Take user input, calculate the cost and print a receipt with special pricing and in a loop


import static java.lang.System.in;
import java.util.Scanner;


class Week4
{
	
	
	public static void main(String[] args) {
		System.out.println("                             Rocky Dry Cleaners Entry System");
		 final double price = 8.50;
		 final double threeGarments = 20.00;
		 final double morethanthreegarments = 6.50;
		 final int N = 4;
		 double charge = 0;
		 int i = 0;
		 String customerName;
		 int numofgarments;
		 int totalGarments = 0;
		 double totalCharge = 0;

		//Creating scanner object
		Scanner inText = new Scanner(in);
		Scanner inNumber = new Scanner(in);

       
	   
	   while(i <= (N - 1))
{
		System.out.print("Please enter the customer name " + (i + 1) + " ==> ");
		customerName = inText.nextLine();
                System.out.print("Enter the number of garments for " + customerName + "==> ");
                numofgarments = inNumber.nextInt();
                
				if (numofgarments >= 2)
				{
					charge = numofgarments * price;
				}
				if (numofgarments == 3)
				{
					charge = threeGarments;
				}
				
				if (numofgarments > 3)
				{
					charge = threeGarments + ((numofgarments -3) * morethanthreegarments);
				}
				
				totalGarments = totalGarments + numofgarments;
				totalCharge = totalCharge + charge;
				
                System.out.println("---Receipt---");
                System.out.println("Customer name: " + customerName);
                System.out.println("Number of garments: " + numofgarments);
                System.out.println("Total charge: $" + charge);
				i++;
				
}

//Closing scanner objects (Memmory leaks)
inText.close();
inNumber.close();
		
System.out.println("The average number of garments is: " + (totalGarments / N));
System.out.println("The total charges collected is $" + totalCharge);
		
	}
}