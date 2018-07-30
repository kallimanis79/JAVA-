
import java.util.Scanner;

public class MaximumFinder2 
{
		   
	public static void main( String args[] )
	{
		Scanner input = new Scanner( System.in );
		
		double number1;
		double number2;
		double result;
				
		System.out.print("Enter first number: " );
		number1 = input.nextDouble(); // read first double
		
		System.out.print("Enter second number: " );
		number2 = input.nextDouble(); // read second double

		// determine the maximum value
		result = Math.max( number1, number2 ); 

		// display maximum value 
		System.out.println( "Maximum is: " + result ); 
	}
	
} 
