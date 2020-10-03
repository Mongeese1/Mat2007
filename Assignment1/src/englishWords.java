import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;



public class englishWords {
	public static void main(String[] args)
	{
		List<String> wordz =loadwords("C:\\Users\\lbowe\\eclipse-workspace\\Assignment1\\src\\words-sowpods.txt");
		//HashMap<Integer,String> wordcount = new HashMap<Integer,String>();
		List<String> wordc = new ArrayList<String>();
		for (int j =0; j<wordz.size();j++) {
			if(isword(wordz.get(j))&& (wordz.get(j).length()<20)){
				
				wordc.add(wordz.get(j));
				
				
			}
		}
		//System.out.println(Arrays.asList(wordcount));
		//System.out.println(Arrays.toString(wordc.toArray()));
		System.out.println(wordz.size());

	}
public static List<String> loadwords(final String filename)
{
	final List<String> words = new ArrayList<>();
	
	try (Scanner s = new Scanner(new FileReader(filename))) {
	    while (s.hasNext()) {
	    	//if(isword(s.nextLine())) {
	    		words.add(s.nextLine());}}
	    
	catch (final IOException e) { e.printStackTrace(); }
	
	return words; 
}
public static boolean isword(final String word) {
	word.toLowerCase();
	word.trim();
	boolean flag = true;
	for(int i = 0; i<word.length();i++)
	{ 
		if(!Character.isLetter(word.charAt(i))) {
			flag =  false;
			}
	}
	return flag;
	
}
		
}



