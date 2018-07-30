
import java.util.Scanner; 

public class DivisionRemainder 
{

   public static void main( String args[] )
   {
	
	Scanner input = new Scanner( System.in );

	int n1, n2;
	double d1, d2; 
	String s;
	char c;
	   	
	System.out.print( "Enter a string: ");
	s = input.next();
	
	System.out.print( "Enter a character: ");   
	c = input.next().charAt(0);

	System.out.print( "Enter first integer: " ); 
	n1 = input.nextInt(); 

	System.out.print( "Enter second integer: " );
	n2 = input.nextInt(); 
	   
	System.out.print( "Enter first double: " ); 
	d1 = input.nextDouble(); 

	System.out.print( "Enter second double: " );
	d2 = input.nextDouble(); 
	
	System.out.println( "String entered = " + s );
	System.out.println( "Character entered = " + c );
	System.out.println("Result for integer division = " + n1 / n2);
	System.out.println("Result for integer remainder = " + n1 % n2);
	System.out.println("Result for double division = " + d1 / d2);
	System.out.println("Result for double remainder = " + d1 % d2);
   } 

} 
