// Compare integers using if statements, relational operators 
// and equality operators.
import java.util.Scanner; // program uses class Scanner

public class Comparison 
{
   // main method begins execution of Java application
   public static void main( String args[] )
   {
	// create Scanner to obtain input from command window
	Scanner input = new Scanner( System.in );

	int number1; // first number to compare
	int number2; // second number to compare
	String name;
	boolean result1, result2, result3, result4, result5, result6;

	System.out.print( "Enter your name: ");
	name = input.next();

	System.out.print( "Enter first integer: " ); // prompt 
	number1 = input.nextInt(); // read first number from user 

	System.out.print( "Enter second integer: " ); // prompt 
	number2 = input.nextInt(); // read second number from user 
      
	result1 = (number1 == number2); 
	result2 = (number1 != number2);
	result3 =  (number1 < number2);
	result4 = (number1 > number2);
	result5 = (number1 <= number2);
	result6 = (number1 >= number2);
	
	System.out.println( "Hello " + name );
	System.out.println("The result of number1 == number2 is: " + result1);
	System.out.println("The result of number1 != number2 is: " + result2);
	System.out.println("The result of number1 < number2 is: " + result3);
	System.out.println("The result of number1 > number2 is: " + result4);
	System.out.println("The result of number1 <= number2 is: " + result5);
	System.out.println("The result of number1 >= number2 is: " + result6);

   } // end method main

} // end class Comparison
