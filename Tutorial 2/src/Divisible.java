import java.util.Scanner;

public class Divisible 
{
	public static void main(String[] args)
	{
		final Scanner stdin = new Scanner(System.in);
		System.out.println("Enter integer value for x:");
		final int x = stdin.nextInt ();
		System.out.println("Enter integer value for y");
		final int y = stdin.nextInt ();
		
		if (x%y==0)
		{
			System.out.println("Ints are divisible");
		}
		else
		{
			System.out.println("Ints are not divisible");
		}
	
	}
}
