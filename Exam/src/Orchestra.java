//Luka Bowen i6222534 Q3
public class Orchestra {
	String name;
	Conductor conductor;
	Musician musician;//should have been musician list but ran out of time to implement
	public int numMusician = 0;
	public Orchestra(String name, Conductor conductor) {
		this.name = name;
		this.conductor = conductor;
	}
	public void add(final Musician musician) {
		this.musician = musician;
		numMusician++;
	}
	@Override
	public String toString() {
		String str = "The " + name +" conducted by " + conductor + " has " + numMusician + " Musicians\n " + musician.name + " plays" + musician.toString();
		return str;
	}
	

}
