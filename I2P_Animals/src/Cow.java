/**
 * I2P Tutorial 6: Cow class for Animals example.
 * @author cambolbro
 */
public class Cow extends Mammal implements Noisy
{
	public Cow()
	{
	}
	
	public Cow(final String name)
	{
		super(name);
	}

	@Override
	public String type()
	{
		return "cow";
	}
	
	@Override
	public String noise()
	{
		return "moo";
	}
}
