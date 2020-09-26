import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sortreverse {
	public static void main(String[] args)
	{
		ArrayList<Integer> num = new ArrayList<Integer>();
		int i = 0;
		while(i<10)
		{
			num.add(i);
			i++;
		}
		System.out.println(num.toString());
		Collections.sort(num);
		System.out.println(num);
		Collections.sort(num, Collections.reverseOrder());
		System.out.println(num);
	}

}
