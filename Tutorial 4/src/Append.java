import java.util.Arrays;

public class Append {

	public static void main(String[] args)
	{
	int x[] = {29,30};
	int y[] = {30, 31};
	
	System.out.println(Conc(x,y));
	
	}
	public static String Conc(int a[], int b[])
	{
		int aLen = a.length;
		int bLen = b.length;
		int[] result = new int[aLen + bLen];
		System.arraycopy(a, 0, result, 0, aLen);
		System.arraycopy(b, 0, result, aLen, bLen);

	    return Arrays.toString(result);
	}
}
