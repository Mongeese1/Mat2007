import java.util.Scanner;

public class Vowel 
{
	public static void main(String[] args)
	{
		String vowels = "aeiou";
		String vowels_u = vowels.toUpperCase();
		System.out.println("Enter Character");
		final Scanner stdin = new Scanner(System.in);
		char input = stdin.next().charAt(0);
		if ((Character.isAlphabetic(input)==false))
		{
			System.out.println("Not in alphabet");
			
		}
		else
		{
			boolean found = false;
			for (int i=0; i < (vowels.length());i++)
				if ((input == vowels.charAt(i)) || (input == vowels_u.charAt(i)))
				{
					found = true;
				}
			if (found)
			{
				System.out.println("Character is vowel");
			}
			else
			{
				System.out.println("Character is not vowel");
			}
//			switch(input)
//			{
//				case 'a':
//					System.out.println("is vowel");
//					break;
//				case 'i':
//					System.out.println("is vowel");
//					break;
//				case 'o':
//					System.out.println("is vowel");
//					break;
//				case 'e':
//					System.out.println("is vowel");
//					break;
//				case 'u':
//					System.out.println("is vowel");
//					break;
//				case 'A':
//					System.out.println("is vowel");
//					break;
//				case 'E':
//					System.out.println("is vowel");
//					break;
//				case 'I':
//					System.out.println("is vowel");
//					break;
//				case 'U':
//					System.out.println("is vowel");
//					break;
//				case 'O':
//					System.out.println("is vowel");
//					break;
//					
//				default:
//					System.out.println("!is vowel");
//			
//				
				
			}
				
	
		}
}

