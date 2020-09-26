
public class Average {
	public static void main(String[] args)
	{
		int data[] = {12,25,20};
		System.out.println(average(data));
	}

	public static float average(int array[])
	{
		float total = 0;
		for(int i=0;i<array.length;i++)
		{
			total = total+ array[i];
		}
		float average = total/array.length;
		return average;
		
	}
}
