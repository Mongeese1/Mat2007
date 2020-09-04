import java.util.Scanner;

public class TestReader_Butbetter 
{
	public static void main(final String[] args)
	{
		final Scanner stdin = new Scanner(System.in);
		System.out.println("Enter integer value for a:");
		final int a = stdin.nextInt ();
		System.out.println("Enter integer value for b");
		final int b = stdin.nextInt ();
		int zum = a + b;
		int average = zum / 2 ; 
		
		//When taking the mean of two numbers that are even and odd the program will output 
		//The program will output the even number
		//This is due to variables being cast as int type, since the division of a even and odd
		//Number will create a remainder, java tosses it away and prints the first integer value
		//This could be fixed by storing variables as a double
		System.out.println("The mean of these two numbers is : " + average);
	}
	
}
