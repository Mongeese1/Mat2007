package scrabblething;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Letters {

	
	public static final ArrayList<Integer> scores = 
		new ArrayList<Integer>(Arrays.asList
				(1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10,0));//I used arraylists since they are closer to the python arrays i'm used to working with.
	public static final ArrayList<Integer> count = 
		new ArrayList<Integer>(Arrays.asList
				(9,2,2,4,12,2,3,2,9,1,1,4,2,6,8,2,1,6,4,6,4,2,2,1,2,1,2));//Much easier to handle than normal java arrays

	public static int score = 0;
	
	public static String arraytostring(ArrayList<Character> tempstr) {//helper method to build the word from it's scrabble tiles
		StringBuilder builder = new StringBuilder(tempstr.size());
		for(Character ch : tempstr) {
			builder.append(ch);
		}
		return builder.toString();
	}
	private static WordScore wordScore
	(
	final String word
	)//Was having trouble updating the count array when passing it to the function, decided it would be much simpler to simply have the array inside the function
	{
		String lword = word.toLowerCase();
		ArrayList<Integer> tilecount = 
				new ArrayList<Integer>(Arrays.asList
						(9,2,2,4,12,2,3,2,9,1,1,4,2,6,8,2,1,6,4,6,4,2,2,1,2,1,2));
		char [] array = lword.toCharArray();//Some variables to hold temporary values
		ArrayList<Integer> charind = new ArrayList<Integer>();
		ArrayList<Integer> letterscore = new ArrayList<Integer>();
		
		ArrayList<Character> tempstr = new ArrayList<Character>();
		
		int score = 0;
		for (int i =0;i<array.length;i++) {//loop through the word
			charind.add(array[i] - 'a');//get index of each char
//			if (tilecount.get(charind.get(i))<0) {
//				return null;
//			}
//			
				if(tilecount.get(charind.get(i))>0) {//if tilecount at the character index is not 0 do this
					letterscore.add(scores.get(charind.get(i)));//add the letterscore of the character to the letterscore array
					tempstr.add(array[i]);//add the character just used to the tempstr array in order to re-build the word using scrabble tiles
					tilecount.set(charind.get(i),tilecount.get(charind.get(i)) - 1);//when a character is used count it's tilecount down
//					System.out.println(Arrays.toString(tilecount.toArray()));
//					System.out.println(Arrays.toString(letterscore.toArray()));
//					System.out.println(Arrays.toString(charind.toArray()));
//					System.out.println(charind.get(i));
				}
				else if(tilecount.get(charind.get(i))==0 && tilecount.get(26)>0 ){//if tilecount at charind is 0 but there are still wildcards do this
					//while(tilecount.get(26)!=0 && tempstr.size()<array.length - 1) {
						letterscore.add(scores.get(26));//add wildcard score to letterscore array
						tempstr.add('*');//add wildcard to the tempstr array for printing
						tilecount.set(26, tilecount.get(26)-1);}//count the tilecount for the wildcard down
				else if(tilecount.get(charind.get(i)) == 0 && tilecount.get(26)==0){//if tilecount at charind is 0 and no wildcards left
					return null;
				}
				//}
		}
		for(int ii = 0 ; ii<letterscore.size();ii++) {//sum the array of letterscores to get the wordscore
			score = score + letterscore.get(ii);
		}
		//System.out.println(Arrays.toString(tilecount.toArray()));
		
		String newword = arraytostring(tempstr);//rebuild the word
		WordScore newwordscore = new WordScore(newword,score);
		return newwordscore;

		
		
	}
	public static List<WordScore> validwords(final List<String> wordlist){
		List<WordScore> valid = new ArrayList<WordScore>();
		for(int i =0; i<wordlist.size();i++) {//loop through wordlist
			if(wordScore(wordlist.get(i))!=null) {//if wordscore is not null
				valid.add(wordScore(wordlist.get(i)));//add wordscore to the returned list of wordscores
			}
		}
		return valid;
	}
	public static void main(String[] args) {
		//ArrayList<WordScore> tw = new ArrayList<WordScore>();
	
		final Dictionary dictionary = new Dictionary("C:\\Users\\lbowe\\eclipse-workspace\\Assignment1\\src\\words-sowpods.txt"); //can't get it to find file without the full path, sorry.
		//List<WordScore> valid = validwords(dictionary.words());
		//List<String> word = dictionary.words();
		//List<WordScore> wordscore = validwords(word);
		//System.out.println("The word: " + word.get(91269) + " can be made using scrabble tiles " +  wordscore.get(91269).word()+ " and has a scrabble word score of" + " " + wordscore.get(91269).score());
		List<WordScore> valid = validwords(dictionary.words());//create array of valid words
		WordScore.sort(valid);//sort array
		ArrayList<WordScore> highscore = new ArrayList<WordScore>();//create array to hold word(s) with highest score
		//highscore.add(valid.get(0));
		for(int i=0; i<valid.size();i++) {//for the sorted array
			if(valid.get(0).score() == valid.get(i).score()) {//if any other word has the same score as the word with the highest score
				highscore.add(valid.get(i));//add it to the highscore array
			}
		}
		for(int i = 0; i<highscore.size();i++) {//for the highscore array
			System.out.println("The scrabble word(s) with the highest score is: " + highscore.get(i).word() + " and its score is " + highscore.get(i).score());
			}
		int tot_score = 0;
		for(int i=0; i<scores.size();i++) {//count max possible score of word using all scrabble tiles
			tot_score = tot_score + (scores.get(i)*count.get(i));
		}
		System.out.println("The total wordscore for all 100 tiles is: " + tot_score);
		
		

	}	
}