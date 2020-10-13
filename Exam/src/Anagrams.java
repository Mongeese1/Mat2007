import java.util.ArrayList;
import java.util.Arrays;
//Luka Bowen i6222534 Q2
public class Anagrams {
	
	static int[] letterCounts(final String letters) {
		char[] str = letters.toLowerCase().toCharArray();
		int[] charcount = new int[26];//new array alphabet size
		//ArrayList<Integer> count = new ArrayList<Integer>();
		for(int i = 0; i<str.length;i++) {//for length of string
			int charind = str[i] - 'a';//get charind at iteration
			charcount[charind]++;//count charind
		}
		//System.out.println(Arrays.toString(charcount));
		return charcount;
	}
	static boolean wordInLetters(final String word, final int[] letterCounts) {
		char[] str = word.toLowerCase().toCharArray();
		boolean flag = true;
		int[] lettercount = letterCounts(word);
		for(int i = 0; i<str.length;i++) {
			int charind = str[i] -'a';
			if(letterCounts[charind]<lettercount[charind]) {//if lettercounts is less than lettercount of word
				flag = false;
			}
		}
		return flag;
	}
	static void anagrams(final String text)
	{
		final Dictionary dictionary =
				new Dictionary("words-sowpods.txt");
		final String letters =
				text.replaceAll(" ", "").toUpperCase();
		final int[] letterCounts = letterCounts(letters);
		final ArrayList<String> list = new ArrayList<>();
		for (final String word : dictionary.words())
			if (wordInLetters(word, letterCounts))
			{
				System.out.println(word);
				list.add(word);
			}
		System.out.println(list.size() + " words from: " + text);
	}
}
