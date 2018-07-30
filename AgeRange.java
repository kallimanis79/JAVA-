
import java.util.Scanner;
public class AgeRange
{
	public static void main( String args[] ) 
	{
		Scanner input = new Scanner( System.in );
		
		int age;
		String name;
				
		System.out.print("Enter your name: " );
		name = input.next();
		
		System.out.print("Enter your age: " );
		age = input.nextInt();
			
		printInfo(name, age);
	}

	public static void printInfo (String name, int num)
	{
		System.out.println("Welcome: " + name);
		
		checkAge(num);
	} 
	
	public static void checkAge( int num )
	{		
		if(num < 30)
		{
			System.out.println("You are still young");
		}
		else
		{
			System.out.println("You are old");
		}
	} 

}

	


