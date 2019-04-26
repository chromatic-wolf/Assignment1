// Programmer: Caleb Davidson 12110634  
// File: Week2.java
// Date: 24/3/2019
// Purpose: COIT11222 assignment one question two T119
// Take user input, calculate the cost and print a receipt


import static java.lang.System.in; //import for input stream
import java.util.Scanner; //imports the scanner object


class Week2 // class name for week 2
{
	
	//the main method for s(entry point of program)
	public static void main(String[] args) {
		 final double price = 8.50; // Price of a garment
       String customerName; // holds the customers name
       int numofgarments; //holds how many garments the customer wants
	   Double charge; //holds a decimal value for the cost of the garments
	   
		//Creating scanner objects
		Scanner inText = new Scanner(in); // for text values
		Scanner inNumber = new Scanner(in); // for number values (ints, doubles ect)
		System.out.print("Please enter the customer name ==> ");
		customerName = inText.nextLine(); //takes users inpput and puts in in the variable customerName
		System.out.print("\n"); // adds a empty line
                System.out.print("Enter the number of garments for " + customerName + "==> ");
                numofgarments = inNumber.nextInt(); //takes user input and puts it in variable num of garments
                charge = numofgarments * price; //calculates the charge by multiplying numofgarments by price
				//this section prints out a receipt
                System.out.println("\n\n ---Receipt---");
                System.out.println("Customer name: " + customerName);
                System.out.println("Number of garments: " + numofgarments);
                System.out.printf("Total charge: " + "$%.2f", charge); //$%.2f formats charge to 2 decimal places
				
				//Destroying scanner objects (memory leaks)
				inText.close();
				inNumber.close();
		
		
	}//end main
}//end class