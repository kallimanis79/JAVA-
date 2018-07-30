
import java.util.Scanner;

public class FactorialNumbers
{
	public static void main( String args[] ) 
	{
		Scanner input = new Scanner( System.in );
		
		int num1;
				
		System.out.print("Enter number: " );
		num1 = input.nextInt();
		
		System.out.println("The factorial of " + num1 + " is: " + myFactorial(num1));
	}

	public static int myFactorial(int num)
	{
		if(num <= 1)
		{
			return 1;
		}
		else
		{
			return(num * (myFactorial(num - 1)));
		}
	}	 
}

	


