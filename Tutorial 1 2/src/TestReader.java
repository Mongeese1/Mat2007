import java.util.Scanner;

public class TestReader 
{
	public static void main(final String[] args)
	{
		final Scanner stdin = new Scanner(System.in);
		System.out.println("Enter integer value for a:");
		final int a = stdin.nextInt ();
		System.out.println("You entered: " + a);
	}
	//Entering 9 prints 9
	//9.9 produces error due to lack of double type in code
	//A letter produces another type error due to it being an unnacepted by the code
}
