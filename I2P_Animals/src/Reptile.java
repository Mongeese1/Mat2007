/**
 * I2P Tutorial 6: Reptile class for Animals example.
 * @author cambolbro
 */
public abstract class Reptile extends Animal
{
	static int numReptiles = 0;

	public Reptile()
	{
		numReptiles++;
	}

	public Reptile(final String name)
	{
		super(name);
		numReptiles++;
	}
	
	public static int numReptiles()
	{
		return numReptiles;
	}

	@Override
	public String phylum()
	{
		return "Chordata";
	}

	@Override
	public String clss()
	{
		return "Reptilia";
	}
}
