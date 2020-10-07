import java.util.ArrayList;
import java.util.Arrays;

public class Letters {
	
	public static final ArrayList<Integer> scores = 
		new ArrayList<Integer>(Arrays.asList
				(1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10,0));
	public static final ArrayList<Integer> count = 
		new ArrayList<Integer>(Arrays.asList
				(9,2,2,4,12,2,3,2,9,1,1,4,2,6,8,2,1,6,4,6,4,2,2,1,2,1,2));
	public static final ArrayList<Integer> tilecount = 
			new ArrayList<Integer>(Arrays.asList
					(9,2,2,4,12,2,3,2,9,1,1,4,2,6,8,2,1,6,4,6,4,2,2,1,2,1,2));
	private static WordScore wordScore
	(
	final String word, final ArrayList<Integer> tilecount
	)
	{
		char [] array = word.toCharArray();
		ArrayList<Integer> charind = new ArrayList<Integer>();
		ArrayList<Integer> letterscore = new ArrayList<Integer>();
		for (int i =0;i<array.length;i++) {
			charind.add(array[i] - 'a');
			for( int j = 0; j<scores.size();j++) {
				if(tilecount.get(j)!=0) {
				letterscore.add(scores.get(charind.get(i)));
				tilecount.set(count.get(charind.get(i)),tilecount.get(charind.get(i)) - 1);}
				
			}
			
			
		}
		
	}
	}