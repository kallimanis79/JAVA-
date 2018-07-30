
import java.util.Scanner;

public class GreatestCommonDivisor
{
	public static void main( String args[] ) 
	{
		Scanner input = new Scanner( System.in );
		
		int num1, num2;
				
		System.out.print("Enter 1st number: " );
		num1 = input.nextInt();
		
		System.out.print("Enter 2nd number: " );
		num2 = input.nextInt();
		
		System.out.println("The greatest common divisor is: " + gcdMethod(num1, num2));
	}

	public static int gcdMethod (int a, int b)				
	{
		if (b==0)							
			return a;
		else
		{
			return gcdMethod( b, a%b);			
		}	
	}	 
}

	


