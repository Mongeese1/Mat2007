
public class Line implements Geometry,HasLength{

	public Point point_a;
	public Point point_b;
	 
	public Line(Point a, Point b) {
		this.point_a = a;
		this.point_b = b;
	}
	@Override
	public Point centroid() {
		double centre1 = (point_a.x+point_b.x)/2;
		double centre2 = (point_a.y+point_b.y)/2;
		Point centre = new Point(centre1,centre2);
		return centre;
	}		

	@Override
	public Rectangle bound() {
		Rectangle boundrect = new Rectangle();
		boundrect.w = point_a.x - point_a.x;
		boundrect.h = point_b.x - point_b.y;
		boundrect.pt = point_a;
		return boundrect;
	}

	@Override
	public void translate(double dx, double dy) {
		// TODO Auto-generated method stub
		point_a.x = point_a.x+dx;
		point_a.y = point_a.y+dy;
		point_b.x = point_b.x+dx;
		point_b.y = point_b.y+dy;
		
	}

	@Override
	public void scale(double sx, double sy) {
		// TODO Auto-generated method stub
		point_a.x = point_a.x+sx*(point_b.x-point_a.x);
		point_a.y = point_a.y+sy*(point_b.y-point_a.y);
		point_b.x = point_b.y+sx*(point_a.x-point_b.x);
		point_b.y = point_b.y+sx*(point_a.y-point_b.y);
	}
	public double length() {
//		int len=0;
		//eucledian distance
		double len = ((point_a.x - point_b.x) * (point_a.x - point_b.x)) +((point_a.y - point_b.y)* (point_a.y - point_b.y));
		len = Math.sqrt(len);
		return len;
	}
}	
