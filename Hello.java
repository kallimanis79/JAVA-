import java.util.Scanner;
public class Hello
{
	public static void main( String args[] ) 
	{
		Scanner input = new Scanner( System.in );
		
		String name;
				
		System.out.print("Enter name: " );
		name = input.next();
		
		hello(name);
	}

	public static void hello( String name )
	{
		System.out.println("Hello " + name);
	} 
}

	


