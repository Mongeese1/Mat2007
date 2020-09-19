
public class digit {
	public static void main(String[] args)
	{
		
		System.out.println(isSingleDigit(1));
					
		 	
			
			
		
				
	}
			

static String isSingleDigit(int x) 
{
	try {
		Integer.toString(x);
	}
	catch(Exception e)
	{
		return("Input is not int");
	}
	String y= Integer.toString(x);
	if(y.length() > 1)
	{
		return("No");
	}
	else
		return ("Yes");}}


