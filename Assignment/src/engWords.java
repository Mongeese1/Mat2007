import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class engWords {
	private final static int [] n1grams=new int[26];
	private final static int [][] n2grams=new int[26][26];
	private final static int [][][] n3grams= new int [26][26][26];
	private final static int [][][][] n4grams= new int [26][26][26][26];
	public static void main(String[] args)
	{
		List<String> wordz =loadwords("/home/r-are/eclipse-workspace/Assignment/src/words-sowpods.txt");//load word list
//		HashMap<Integer,Integer> wordcount = new HashMap<Integer,Integer>();
		List<String> wordc = new ArrayList<String>();//create empty string list to hold valid values
		for (int j =0; j<wordz.size();j++) {
			if(isword(wordz.get(j))){//Check valid word condition
				
				wordc.add(wordz.get(j));//if valid add to list
				
				
			}}

		//String word = sb.toString();"/home/r-are/eclipse-workspace/Assignment/src/words-sowpods.txt"
		//int countsize = wordc.size();
		int [] [] count_array= new int [20] [2];//empty array to hold length of str
		//int counter = 0;
		for (int i =0;i<20;i++) {//loop through array and fill with ints
			count_array[i][0] = i;
			for(int j = 0; j<wordc.size() ;j++)
				if (Integer.compare(i,wordc.get(j).length()) == 0) {//if int i = length count array at i up
					count_array[i][1]++; 
					//counter = 0;}}
				}
			
			
		}

//		}
//		System.out.print();
//		System.out.println(Arrays.deepToString(count_array));
		//if(wordc.get(1).length()==3){
		System.out.println(Arrays.deepToString(count_array));//2 is length 1, 3 is length 2 etc.
		//System.out.println(wordc.size());
		countNGrams(wordc,3);//uncomment to run ngrams, works fine, i think, but prints many times(fixed by fucking with curly brackets), int+1 is what order n-gram to search for
		
	}
		

		
		
		
				
		
		/*
		 * //int counter = 0; for (int i=0;i<wordc.size();i++) { int j1 = 0; while
		 * (j1<20) { if(j1 == wordc.get(i).length()) {
		 * wordcount.put(j1,wordc.get(i).length()); j1++;
		 * 
		 * 
		 * }}}
		 * 
		 * 
		 * //System.out.println(Arrays.asList(wordcount));
		 * System.out.println(wordcount.toString()); //System.out.println(wordz.size());
		 */
	
public static List<String> loadwords(final String filename)
{
	final List<String> words = new ArrayList<>();
	
	try (Scanner s = new Scanner(new FileReader(filename))) {//read file
	    while (s.hasNext()) {//if next line is not null
	    	//if(isword(s.nextLine())) {
	    		words.add(s.nextLine());}}//add to list
	    
	catch (final IOException e) { e.printStackTrace(); }
	
	return words; 
}
public static boolean isword(final String word) {
	word.toLowerCase();
	word.trim();
	boolean flag = true;
	for(int i = 0; i<word.length();i++)
	{ 
		if(!Character.isLetter(word.charAt(i))&&word.length()<20) {//check if valid word
			flag =  false;
			}
	}
	return flag;
	
}
		
public static void countNGrams(final List<String> words, int n) {
	//List<String> ngram = new ArrayList<String>();
	
	//create variables
	int max1gram = n1grams[0];
	int max1gram_ind = 0;
	
	int max2gram = n2grams[0][0];
	int max2gram_ind1 = 0;
	int max2gram_ind2 = 0;
	
	int max3gram = n3grams[0][0][0];
	int max3gram_ind1 = 0;
	int max3gram_ind2 = 0;
	int max3gram_ind3 = 0;
	
	int max4gram = n4grams[0][0][0][0];
	int max4gram_ind1 = 0;
	int max4gram_ind2 = 0;
	int max4gram_ind3 = 0;
	int max4gram_ind4 = 0;	
	

	
	for(int i =0; i<words.size();i++) {//for list of words

		
		
		
		
	
		//these if statements and for loops all function the same, just with more dimensions
		if(n==0) //check function input for desired n-grams
		{  
			for (int j = 0; j < words.get(i).length() - n; j++) {//loop through string
		
            String split = words.get(i).substring(j, j + n+1);//create substring of length 1
            char split1= split.charAt(0);
            n1grams[split1 - 'a']
                    = n1grams[split1 - 'a'] + 1;

            	if (max1gram < n1grams[split1 - 'a']) {
            		max1gram = n1grams[split1 - 'a'];
            		max1gram_ind = split1 - 'a';
            }
            	}}
			

	

	
//		
	if(n==1) {
		for (int j = 0; j < words.get(i).length() - n; j++) {
			String split = words.get(j).substring(j, j + n+1);
//		
			n2grams[split.charAt(0)-'a'] [split.charAt(1)-'a']=
					n2grams[split.charAt(0)-'a'] [split.charAt(1)-'a'] +1;
			
			if (max2gram<n2grams[split.charAt(0)-'a'] [split.charAt(1)-'a']) {
				max2gram = n2grams[split.charAt(0)-'a'] [split.charAt(1)-'a'];
				max2gram_ind1 = split.charAt(0)-'a';
				max2gram_ind2 = split.charAt(1)-'a';
			}
			
			}
		
	
	}
	
		if(n==2) {
			for (int j = 0; j < words.get(i).length() - n; j++) {
				String split = words.get(i).substring(j, j + n+1);
					
				
	
				n3grams[split.charAt(0)-'a'] [split.charAt(1)-'a'][split.charAt(2)-'a']
				=n3grams[split.charAt(0)-'a'] [split.charAt(1)-'a'][split.charAt(2)-'a']+1;
				if (max3gram<n3grams[split.charAt(0)-'a'] [split.charAt(1)-'a'][split.charAt(2)-'a']) {
					max3gram = n3grams[split.charAt(0)-'a'] [split.charAt(1)-'a'][split.charAt(2)-'a'];
					max3gram_ind1 = split.charAt(0)-'a';
					max3gram_ind2 = split.charAt(1)-'a';
					max3gram_ind2 = split.charAt(2)-'a';
					}
				
				}}
			
			
		if(n==3) {
			for (int j = 0; j < words.get(i).length() - n; j++) {
				String split = words.get(i).substring(j, j + n+1);
			
			
	
			n4grams[split.charAt(0)-'a'] [split.charAt(1)-'a'][split.charAt(2)-'a'][split.charAt(3)-'a']=
					n4grams[split.charAt(0)-'a'] [split.charAt(1)-'a'][split.charAt(2)-'a'][split.charAt(3)-'a']+1;
			if (max4gram<n4grams[split.charAt(0)-'a'] [split.charAt(1)-'a'][split.charAt(2)-'a'][split.charAt(3)-'a']) {
				max4gram = n4grams[split.charAt(0)-'a'] [split.charAt(1)-'a'][split.charAt(2)-'a'][split.charAt(3)-'a'];
				max4gram_ind1 = split.charAt(0)-'a';
				max4gram_ind2 = split.charAt(1)-'a';
				max4gram_ind3 = split.charAt(2)-'a';
				max4gram_ind4 = split.charAt(3)-'a';
				}
		      
	       
		}
		

	
	}
	
	}
	if(n==0) {System.out.println("most common 1-gram is '"
			+ (char) ('a' + max1gram_ind)
			+ "' appearing a number of " + max1gram + " times");
		}
	if(n==1) {
		 System.out.println("most common 2-gram is '"
	                + (char) ('a' + max2gram_ind1) + (char) ('a' + max2gram_ind2)
	                + "' appearing a number of " + max2gram + " times");}
	if (n==2)
	{
		System.out.println("most common 3-gram is '"
                + (char) ('a' + max3gram_ind1) + (char) ('a' + max3gram_ind2)
                + (char) ('a' + max3gram_ind3)
                + "' appearing a number of " + max3gram + " times");}
	if (n==3){
		System.out.println("most common 4-gram is '"
				+ (char) ('a' + max4gram_ind1) + (char) ('a' + max4gram_ind2)
				+ (char) ('a' + max4gram_ind3) + (char) ('a' + max4gram_ind4)
				+ "' appearing a number of " + max4gram+ " times");}
	
		
	}}


		
		
		
			
		
		
	




