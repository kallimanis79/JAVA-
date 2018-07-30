
import java.util.Scanner;
public class DiscountCalculation
{
	public static void main( String args[] ) 
	{
		Scanner input = new Scanner( System.in );
		
		int number1;
				
		System.out.print("Enter price for computer: " );
		number1 = input.nextInt();
			
		System.out.println( "Final Value of car is: " + finalValue( number1)); 
	}

	public static double finalValue( int num )
	{
		double value;
		
		if(num < 1000)
		{
			value = discount1(num);
		}
		else
		{
			value = discount2(num);
		}
		
		return value;
	} 
	
	public static double discount1( int num )
	{
				
		return num - num * 10 / 100;
	} 
	
	public static double discount2( int num )
	{
				
		return num - num * 20 / 100;
	}
}

	


