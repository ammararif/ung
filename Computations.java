//----------------------------------------------------------------------------------------------------------
// Computations.java										Author: Ammar Arif
// 														    Class: CSCI 1301
// This program will compute different variables and values. 
//----------------------------------------------------------------------------------------------------------

public class Computations 
{

	public static void main(String[] args)
	{
		//Declares the integers with their respective variable names
		int number1 = 15;
		int number2 = 22;
		int number3 = 30;
		final int MULTIPLIER = 3;
		
		//Prints the three numbers.
		System.out.println("The numbers are " + number1 + ", " + number2 + ",and " + number3 + ".\n");
		
		//Prints the average of the three variables using the double data type.
		System.out.println("The average of these three numbers is " 
						    + ((double) (number1 + number2 + number3) / 3 ) + ".\n"); 
		
		//Prints the quotient of the the third number and the second number.
		System.out.println("The quotient of the third number, " + number3 + ", divided by the second number, "
							+ number2 + " is " + (number3 / number2 ) + ".\n");
		
		//Prints the remainder of the third number and the second number.
		System.out.println("The remainder of third number, " + number3 + ", divided by the second number, " + number2
							+ " is " + (number3 % number2) + ".\n");
		
		//Prints the product of the three variables.
		System.out.println("The product of the three numbers is " + (number1 * number2 * number3) + ".\n");
		System.out.println("******************\n");
		
		//------------------------------------------------------------------------
		// Takes the variables and multiplies them with the constant MULTIPLIER
		//------------------------------------------------------------------------
		
		number1 = number1*MULTIPLIER;
		number2 = number2*MULTIPLIER;
		number3 = number3*MULTIPLIER;
		
		//-----------------------------------------------------------------------------------------------------
		//Exact same layout as the top however, the past statements change the values for each variable thus 
		//changing the result for each printed statement.
		//-----------------------------------------------------------------------------------------------------
		
		System.out.println("The numbers are " + number1 + ", " + number2 + ",and " + number3 + ".\n");
		
		System.out.println("The average of these three numbers is " 
						    + ((double) (number1 + number2 + number3) / 3 ) + ".\n"); 
		
		System.out.println("The quotient of the third number, " + number3 + ", divided by the second number, "
							+ number2 + " is " + (number3 / number2 ) + ".\n");
		
		System.out.println("The remainder of third number, " + number3 + ", divided by the second number, " + number2
							+ " is " + (number3 % number2) + ".\n");
		
		System.out.println("The product of the three numbers is " + (number1 * number2 * number3) + ".\n");
		
		System.out.println("******************\n");
		System.out.println("HAVE A NICE DAY!");
	}
}