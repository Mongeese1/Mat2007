
public class Point implements Geometry {
	
	public double x;
	public double y;
	
	public Point() {}
	
	public Point(double n, double m) {
		this.x = n;
		this.y=m;
	}
	@Override
	public Point centroid() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rectangle bound() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void translate(double dx, double dy) {
		// TODO Auto-generated method stub
		this.x = x+dx;
		this.y = y+dy;
	}

	@Override
	public void scale(double sx, double sy) {
		// TODO Auto-generated method stub
		;
		
	}

	@Override
	public void scale(double scale) {//for circle unused here
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		String str = "(" + this.x + " , " + this.y + ")";
		return str;
	}

}
