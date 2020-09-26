import java.util.HashMap;
import java.util.Map;

public class Hashmep {
	public static void main(String[] args)
	{
		HashMap<Integer, Double> sqrts = new HashMap<Integer, Double>();
		int i = 0;
		while(i<1000)
		{
			sqrts.put(i, Math.sqrt(i));
			i++;
			
			
		}
		System.out.println(sqrts.get(256));
	}

}
