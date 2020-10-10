
public abstract class Plant extends Organism {
	
	
		private static int numPlant = 0;
		
		

		//-------------------------------------------------------------------------
		
		// Default constructor: no name
		public Plant()
		{
			this.name = "?";  // no name
			numPlant++;
		}
		
		// Name constructor
		public Plant(final String name)
		{
			this.name = name;
			numPlant++;
		}

		//-------------------------------------------------------------------------
		// Getters
		
		public static int numPlant()
		{
			return numPlant;
		}
		
		@Override
		public String toString()
		{
			String str = "Is a " + type() + (name.equals("?") ? "" : " named " + name) + ".";
			return str;


		}
}
