
import java.util.Scanner;

public class TowersOfHanoi
{
	public static void main( String args[] ) 
	{
		Scanner input = new Scanner( System.in );
		
		int numberDisks;
				
		System.out.print("Enter number of disks: " );
		numberDisks = input.nextInt();
		
		doTowers(numberDisks, 'A', 'B', 'C');
	}

	public static void doTowers(int disks, char pos1, char pos2, char pos3) 
	{
		if (disks == 1)
		{
			System.out.println("Disk 1 from " + pos1 + " to " + pos3);
		}
		else 
		{
			doTowers(disks - 1, pos1, pos3, pos2);
			System.out.println("Disk " + disks + " from " + pos1 + " to " + pos3);
			doTowers(disks - 1, pos2, pos1, pos3);
		}
	}
}
	


