
import java.util.Scanner; 

public class ConstantsVariables 
{
   // main method begins execution of Java application
   public static void main( String args[] )
   {
      // create Scanner to obtain input from command window
      Scanner input = new Scanner( System.in );

      final int number1 = 10;
      int number2; 
      int sum; 

      System.out.print( "Enter first integer: " ); 
      number1 = input.nextInt();

      System.out.print( "Enter second integer: " ); 
      number2 = input.nextInt(); 

      sum = number1 + number2; 

      System.out.println( "Sum is: " + sum ); 

   }

}
