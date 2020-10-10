
public class WaterSnake extends Reptile implements Noisy,Swims{
	public WaterSnake() {}
	
	public WaterSnake(final String name) { super(name);}
	@Override
	public String type() {return "WaterSnake";}
	public String noise() {return "hiss";}
	public String swim() {return "swim";}

}
