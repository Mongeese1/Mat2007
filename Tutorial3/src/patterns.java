
public class patterns {

	public static void main(String[] args)
	{
		String pattern1 = "*****";
		for(int i=0;i<=pattern1.length();i++)
		{
			System.out.println(pattern1.substring(0, i));
		}
		String pattern2 = "*******";
		int j=0;
		while(j<pattern2.length())
		{
			String z = pattern2.substring(0,j+1);
			System.out.println(z);
			j+=2;
		}
		int n = pattern2.length();
		while(n>1)
		{
			System.out.println(pattern2.substring(0,n-2));
			n-=2;
		}
		String pattern3 = "*******";
		for(int z = pattern3.length()+2;z>1;z-=2)
		{
			System.out.println(pattern3.substring(0,z-2));
		}
	}
//	public static String reverse(String str)
//	{
//		int n = str.length();
//		char[] temp = new char[n];
//		for (int i =0; i<n;i++)
//		{
//			temp[n-i-1] = str.charAt(i);
//		}
//		return String.copyValueOf(temp);
//	}
}


