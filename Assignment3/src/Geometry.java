
public interface Geometry {

	
	public Point centroid();
	public Rectangle bound();
	public void translate(final double dx, final double dy);
	public void scale(final double sx, final double sy);
	
	/**
	* @return Distance between points a and b.
	* This method is static so can be implemented in the interface.
	*/
	public static double distance(final Point a, final Point b)
	{
	final double dx = b.x - a.x;
	final double dy = b.y - a.y;
	return Math.sqrt(dx * dx + dy * dy);
	}

}
