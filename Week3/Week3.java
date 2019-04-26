// Programmer: Caleb Davidson 12110634 
// File: Week3.java
// Date: 24/3/2019
// Purpose: COIT11222 assignment one question three T119
// Take user input, calculate the cost and print a receipt with special pricing


import static java.lang.System.in;//import for input stream
import java.util.Scanner; //imports the scanner object



class Week3 //class for week3
{
	
	
	public static void main(String[] args) { //main method
		 final double price = 8.50; //stores price of garments
		 final double threeGarments = 20.00;//stores price for 3 garments
		 final double morethanthreegarments = 6.50;//stores price for more than 3 garments
		 double charge = 0;//stores the default charge value 0
		 int i = 0; //stores the counter for the loop
		 String customerName;//stores the customers name
		 int numofgarments;//stores the number of garments the user wants
		 
		//Creating scanner object
		Scanner inText = new Scanner(in); // for text values
		Scanner inNumber = new Scanner(in); // for number values (ints, doubles ect)



   
       
		System.out.print("Please enter the customer name ==> ");
				customerName = inText.nextLine(); //stores the name the customer enters in the variable customerName
				System.out.print("\n");//adds the new line
                System.out.print("Enter the number of garments for " + customerName + "==> ");
                numofgarments = inNumber.nextInt();//takes the users input for number of garments
                
				if (numofgarments <= 2)//if number of garments is less than or equal to 2 use normal pricing
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
				
				
				//printing receipt
                System.out.println("\n\n ---Receipt---");
                System.out.println("Customer name: " + customerName);
                System.out.println("Number of garments: " + numofgarments);
                System.out.printf("Total charge: " + "$%.2f", charge); //$%.2f formating charge to have 2 decimal places

//closing scanners (memory leaks)
inText.close();
inNumber.close();
		
		
	}//end main
}//end class