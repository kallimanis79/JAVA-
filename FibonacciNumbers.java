
import java.util.Scanner;

public class FibonacciNumbers
{
	public static void main( String args[] ) 
	{
		Scanner input = new Scanner( System.in );
		
		long num1;
				
		System.out.print("Enter number: " );
		num1 = input.nextInt();
		
		System.out.println("The fibonacci of " + num1 + " is: " + fibonacci(num1));
	}

	public static long fibonacci(long number) 
	{
		if ((number == 0) || (number == 1)) // base cases
			return number;
		else
			return fibonacci(number - 1) + fibonacci(number - 2);
	}
}

	


