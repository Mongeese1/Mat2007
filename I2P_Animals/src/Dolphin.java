
public class Dolphin extends Mammal implements Noisy,Swims {

	public Dolphin() {}
	public Dolphin(final String name) {
		super(name);}
	@Override
	public String type() {return "Dolphin";}
	
	public String noise() { return "Dolphin noise";}

	public String swim() { return "Swim" ;}


}
