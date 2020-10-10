/**
 * I2P Tutorial 6: Main test class for Animals example.
 * @author cambolbro
 */
public class AnimalTest
{
	public static void main(final String[] args)
	{
		final Organism[] organisms = 
		{
			new Cow("Daisy"),
			new Cow("Bessie"),
			new Cow(),
			new Snake(),
			new Snake("Monty"),
			new Lizard("Liz"),
			new Oak(),
			new Cactus("Spike")
			
		};
		
		for (final Organism organism : organisms)
			System.out.println(organism);
		//System.out.println(Cow.numMammals());
	}
}
