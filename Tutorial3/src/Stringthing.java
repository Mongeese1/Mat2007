
public class Stringthing {
	public static void main(String[] args)
	{
		StringBuilder str = new StringBuilder("Rabbit");
		int idx = str.length() - 1;
		while(idx>0) {
			str.insert(idx, "-");
			idx = idx - 1;
		}
		System.out.println(str.toString());
	}
	
	

}
