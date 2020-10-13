import java.util.HashMap;
//Luka Bowen i6222534 Q1
public class duplicatecount {
	static int duplicateCounter(final int[] values) {
		HashMap<Integer, Integer> xz = new HashMap<Integer,Integer>();
		for(int i = 0; i<values.length;i++) {//for length of values
			xz.put(values[i], i);//put value at index and index
		}
		int diff = values.length - xz.size();
		return diff;
	}

}
