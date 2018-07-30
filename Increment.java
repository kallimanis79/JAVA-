// Prefix increment and postfix increment operators.

public class Increment 
{
   public static void main( String args[] )
   {
      int c;
   
      // demonstrate postfix increment operator
      c = 5; // assign 5 to c
      System.out.println( c );   // print 5
      System.out.println( c++ ); // print 5 then postincrement
      System.out.println( c );   // print 6

      System.out.println(); // skip a line

      // demonstrate prefix increment operator
      c = 5; // assign 5 to c
      System.out.println( c );   // print 5
      System.out.println( ++c ); // preincrement then print 6
      System.out.println( c );   // print 6

   } // end main

} // end class Increment
