import java.util.Scanner;

public class Check 
{
	public static void main(String[] args)
	{
		int x ;
		System.out.println("Enter INT to check if it is even or odd");
		final Scanner stdin = new Scanner(System.in);
		x = stdin.nextInt();
		if (x % 2 ==0) 
		{
			System.out.println("INT is even");
		}
		else
		{
			System.out.println("INT is odd");
		}
				
				
				
		
		
	}


}
