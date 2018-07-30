
import java.util.Scanner;
public class Square
{
	public static void main( String args[] ) 
	{
		Scanner input = new Scanner( System.in );
		
		int number1;
		int result;
				
		System.out.print("Enter number: " );
		number1 = input.nextInt();
		
		result = square( number1); 

	
		System.out.println( "Square is: " + result ); 
	}

	public static int square( int num )
	{
		return num * num;
	} 
}

	


