
// Scope class demonstrates field and local variable scopes.

public class Scope
{
	static int x = 5; 
	
	public static void main( String args[] )
	{
		useLocalVariable();
		useGlobalVariable(); 
		useLocalVariable(); 
		useGlobalVariable(); 
	} 

	// create and initialize local variable x during each call
	public static void useLocalVariable()
	{
		int x = 25; // initialized each time useLocalVariable is called

		System.out.println("x on entering method useLocalVariable is: " + x );
			x++; // modifies this method's local variable x
		System.out.println("x on entering method useLocalVariable is: " + x );
	} // end method useLocalVariable

	// modify class Scope's field x during each call
	public static void useGlobalVariable()
	{
		System.out.println("x on entering method useGlobalVariable is: " + x );
		x *= 10; // modifies class Scope's global x
		System.out.println("x on exiting method useGlobalVariable is: " + x );
	} // end method useGlobalVariable
} // end class Scope

