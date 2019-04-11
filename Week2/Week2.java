// Programmer: Caleb Davidson 12110634  
// File: Week2.java
// Date: 24/3/2019
// Purpose: COIT11222 assignment one question two T119
// Take user input, calculate the cost and print a receipt


import static java.lang.System.in;
import java.util.Scanner;


class Week2
{
	
	
	public static void main(String[] args) {
		 final double price = 8.50;
       String customerName;
       int numofgarments;
	   Double charge;
	   
		//Creating scanner objects
		Scanner inText = new Scanner(in);
		Scanner inNumber = new Scanner(in);
		System.out.print("Please enter the customer name ==> ");
		customerName = inText.nextLine();
                System.out.print("Enter the number of garments for " + customerName + "==> ");
                numofgarments = inNumber.nextInt();
                charge = numofgarments * price;
                System.out.println("---Receipt---");
                System.out.println("Customer name: " + customerName);
                System.out.println("Number of garments: " + numofgarments);
                System.out.printf("Total charge: " + "$%.2f", charge);
				
				//Destroying scanner objects
				inText.close();
				inNumber.close();
		
		
	}
}