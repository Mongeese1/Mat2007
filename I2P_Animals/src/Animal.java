/**
 * I2P Tutorial 6: Animal class for Animals example.
 * @author cambolbro
 */
public abstract class Animal extends Organism
{
	private static int numAnimals = 0;
	
	

	//-------------------------------------------------------------------------
	
	// Default constructor: no name
	public Animal()
	{
		this.name = "?";  // no name
		numAnimals++;
	}
	
	// Name constructor
	public Animal(final String name)
	{
		this.name = name;
		numAnimals++;
	}

	//-------------------------------------------------------------------------
	// Getters
	
	public static int numAnimals()
	{
		return numAnimals;
	}
	


	
	//-------------------------------------------------------------------------
	// Abstract methods
	
	
	//-------------------------------------------------------------------------

	@Override
	public String toString()
	{
		String str = "Is a " + type() + (name.equals("?") ? "" : " named " + name) + ".";
		
		if (this instanceof Noisy &&!(this instanceof Swims))
			str += " (" + ((Noisy)this).noise() + ")";
		if(this instanceof Swims &&!(this instanceof Noisy))
			str +="swims";
		if (this instanceof Noisy && this instanceof Swims)
			str+="(" + ((Noisy)this).noise() + ")" + "(swims)";
		return str;
	}
}
