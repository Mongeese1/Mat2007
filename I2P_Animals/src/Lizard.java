/**
 * I2P Tutorial 6: Lizard class for Animals example.
 * @author cambolbro
 */
public class Lizard extends Reptile
{
	public Lizard()
	{
	}
	
	public Lizard(final String name)
	{
		super(name);
	}
	
	@Override
	public String type()
	{
		return "lizard";
	}
}
