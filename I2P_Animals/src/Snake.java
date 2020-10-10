/**
 * I2P Tutorial 6: Snake class for Animals example.
 * @author cambolbro
 */
public class Snake extends Reptile implements Noisy
{
	public Snake()
	{
	}
	
	public Snake(final String name)
	{
		super(name);
	}
	
	@Override
	public String type()
	{
		return "snake";
	}

	@Override
	public String noise()
	{
		return "hiss";
	}
}
