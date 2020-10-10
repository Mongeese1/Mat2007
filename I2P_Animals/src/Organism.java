
public abstract class Organism {
	public String name = "";
	private static int numOrgnaisms = 0;
	public String name()
	{
		return name;
	}
	public String kingdom(String kingdom)
	{
		return kingdom;
	}
	public Organism() {
		this.name = "?";
		numOrgnaisms++;
	}
	public Organism(final String name)
	{
		this.name = name;
		numOrgnaisms++;
	}
	public static int numOrgnaisms() {
		return numOrgnaisms;
	}
	
	public abstract String phylum();

	public abstract String clss();

	public abstract String type();
	


}
