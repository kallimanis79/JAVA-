// Prefix decrement and postfix decrement operators.

public class Increment2 
{
   public static void main( String args[] )
   {
      int c;
   
      // demonstrate postfix decrement operator
      c = 5; // assign 5 to c
      System.out.println( c );   // print 5
      System.out.println( c-- ); // print 5 then postdecrement
      System.out.println( c );   // print 4

      System.out.println(); // skip a line

      // demonstrate prefix decrement operator
      c = 5; // assign 5 to c
      System.out.println( c );   // print 5
      System.out.println( --c ); // predecrement then print 4
      System.out.println( c );   // print 4

   } // end main

} // end class Increment2
