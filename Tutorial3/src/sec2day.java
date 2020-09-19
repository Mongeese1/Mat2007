
public class sec2day {

	public static void main(String[] args)
	{
		System.out.println(secondstodays(152327));
	}
	
	public static float secondstodays(final long n)
	{
		float numberOfDays = n/86400f;
		return numberOfDays;
		
	}
}
