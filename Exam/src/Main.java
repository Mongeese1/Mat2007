//Luka Bowen i6222534
public class Main {

	public static void main(String[] args) {
		int [] values = new int[] {2,4,6,2,8,-3,1};
		System.out.println(duplicatecount.duplicateCounter(values));
		String word = "Fred Smith";
		Anagrams.anagrams(word);
		Anagrams.anagrams("Luka Bowen");
		
//		Musician musician = new Musician("Bert",  new Instrument[] {new Triangle(),new Tuba()});
//		System.out.println(musician);
		 final Orchestra orchestra =
				 new Orchestra
				 (
						 "Object-Oriented Orchestra",
						 new Conductor("Vera Similitude")
						 );
		 orchestra.add(new Musician("Anne", new Violin()));
		 orchestra.add(new Musician("Bert", new Triangle()));
		 orchestra.add(new Musician
				 (
						 "Charlie",
						 new Instrument[]{ new Violin(), new Tuba() }
						 ));
		 System.out.println(orchestra); 
	}

	

}
