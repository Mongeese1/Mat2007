
public class Factorial {
	public static void main(String[] args)
	{
		System.out.println(factorialI(5));
		System.out.println(factorialI(5));
	
	}
 public static long factorialI(final int number)
 {
	 long result = 1;
	 for(int m = number; m>1 ; m--)
	 {
		 result = result * m ;
	 }
	return result;
 }
 public static long factorialR(int number)
 {
	 if (number<=2)
	 {
		 return number;
	 }
	 return number*factorialR(number-1);
 }
}


//The code does not work for values bigger than 2^64, as this is the 64 bit integer
//The code accepts int and returns long as the int data type only goes up to 2^32, bigger than any number you can input
//Long is returned as factoirals very quickly get larger than 2^32
//The only way to fix this is to introduce outside librariries 
//Or check if input is > 20 and perform calculations for each value afterwards seperatley
//I.e. if the user inputs 21 return 20! and 20*21, then allow the user to add them by hand
