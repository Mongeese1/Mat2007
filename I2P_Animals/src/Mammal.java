/**
 * I2P Tutorial 6: Mammal class for Animals example.
 * @author cambolbro
 */
public abstract class Mammal extends Animal
{
	private static int numMammals = 0;

	// Default constructor
	public Mammal()
	{
		numMammals++;
	}

	// Name constructor
	public Mammal(final String name)
	{
		super(name);
		numMammals++;
	}
		
	@Override
	public String phylum()
	{
		return "Chordata";
	}
	
	@Override
	public String clss()
	{
		return "Mammalia";
	}

	public static int numMammals()
	{
		return numMammals;
	}
}
