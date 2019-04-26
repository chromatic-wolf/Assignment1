// Programmer: Caleb Davidson 12110634 
// File: Week4.java
// Date: 24/3/2019
// Purpose: COIT11222 assignment one question four T119
// Take user input, calculate the cost and print a receipt with special pricing and in a loop


import static java.lang.System.in;//import for input stream
import java.util.Scanner; //imports the scanner object



class Week4 //class for week 4
{
	
	
	public static void main(String[] args) {
		System.out.println("                             Rocky Dry Cleaners Entry System");//the title
		 final double price = 8.50; //stores price of garments
		 final double threeGarments = 20.00;//stores price for 3 garments
		 final double morethanthreegarments = 6.50;//stores price for more than 3 garments
		 final int N = 6; //the largest number in my id
		 double charge = 0;//stores the default charge value 0
		 int i = 0; //stores the counter for the loop
		String customerName;//stores the customers name
		 int numofgarments;//stores the number of garments the user wants
		 double totalGarments = 0;// stores the total number of garments across all the customers
		 double totalCharge = 0;// stores the total charged across all the customers
		 

		//Creating scanner object
		Scanner inText = new Scanner(in); // for text values
		Scanner inNumber = new Scanner(in); // for number values (ints, doubles ect)

       
	   
	   while(i <= (N - 1)) //while i is less or equal to n - 1 (-1 cause i starts at 0 so the 6th count is actually 5
	   {
System.out.print("\n\n");//double new line spacing
		System.out.print("Please enter the customer name " + (i + 1) + " ==> ");//i keeps track of the current person and the loop count
		customerName = inText.nextLine();//stores the name the customer enters in the variable customerName
		        System.out.print("Enter the number of garments for " + customerName + "==> ");
                numofgarments = inNumber.nextInt();//takes the users input for number of garments
                
				if (numofgarments >= 2)//if number of garments is less than or equal to 2 use normal pricing
				{
					charge = numofgarments * price;
				}
				if (numofgarments == 3)//if number of garments are equal to 3 use the threegarments price
				{
					charge = threeGarments;
				}
				
				if (numofgarments > 3)// if number of garments is larger than 3
				{
					charge = threeGarments + ((numofgarments -3) * morethanthreegarments);
				}
				
				//calculates the totalgarments and totalcharge
				totalGarments = totalGarments + numofgarments; //adds numofgarments to the running total, totalGarments
				totalCharge = totalCharge + charge;//adds charge to the running total, totalCharge
				
				//print receipt
                System.out.println("\n\n ---Receipt---");
                System.out.println("Customer name: " + customerName);
                System.out.println("Number of garments: " + numofgarments);
                System.out.printf("Total charge: " + "$%.2f", charge);
				i++;//increases i by 1
				
}//end of loop

//Closing scanner objects (Memmory leaks)
inText.close();
inNumber.close();
		
		
		//prints the average garments ordered across the customers
System.out.printf("\n The average number of garments is: " + "$%.2f", (totalGarments / N));
//prints the total charges across all customers
System.out.printf("\n The total charges collected is " + "$%.2f", totalCharge);
		
	}//end main
}//end class