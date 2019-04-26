// Programmer: Caleb Davidson 12110634 
// File: Week3.java
// Date: 24/3/2019
// Purpose: COIT11222 assignment one question three T119
// Take user input, calculate the cost and print a receipt with special pricing


import static java.lang.System.in;
import java.util.Scanner;


class Week3
{
	
	
	public static void main(String[] args) {
		 final double price = 8.50;
		 final double threeGarments = 20.00;
		 final double morethanthreegarments = 6.50;
		 double charge = 0;
int i = 0;

		//Creating scanner object
		Scanner inText = new Scanner(in);
		Scanner inNumber = new Scanner(in);



       String customerName;
       int numofgarments;
		System.out.print("Please enter the customer name ==> ");
				customerName = inText.nextLine();
				System.out.print("\n");
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
				
				
				
                System.out.println("\n\n ---Receipt---");
                System.out.println("Customer name: " + customerName);
                System.out.println("Number of garments: " + numofgarments);
                System.out.printf("Total charge: " + "$%.2f", charge);


inText.close();
inNumber.close();
		
		
	}
}