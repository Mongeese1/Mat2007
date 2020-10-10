public class Cactus extends Plant{
	public Cactus()
	{
	}
	
	public Cactus(final String name)
	{
		super(name);
	}
	

	@Override
	public String phylum() {
		// TODO Auto-generated method stub
		return "Magnoliophyta";
	}

	@Override
	public String clss() {
		// TODO Auto-generated method stub
		return "Magnliopsida";
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "Cactus";
	}
}
