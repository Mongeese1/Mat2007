
public class Circle implements Geometry,hasArea{
	public Point point_pt;
	public double radius;
	
	public Circle(Point pt,double rad) {
		this.point_pt = pt;
		this.radius = rad;
	}

	@Override
	public Point centroid() {
		// TODO Auto-generated method stub
		return point_pt;
	}

	@Override
	public Rectangle bound() {
		// TODO Auto-generated method stub
		Rectangle boundrect = new Rectangle();
		boundrect.h = point_pt.x + this.radius;
		boundrect.w = point_pt.y + this.radius;
		boundrect.pt = point_pt;
		return boundrect;
	}

	@Override
	public void translate(double dx, double dy) {
		// TODO Auto-generated method stub
		point_pt.x= point_pt.x+dx;
		point_pt.y = point_pt.y+dy;
		
	}

	@Override
	public void scale(double sx, double sy) {
		// TODO Auto-generated method stub
		
	}

//	@Overridettttttttttttttttttttttttttttttttttttttttttttttttttt
//	public double length() {
//		// TODO Auto-generated method stub
//		//p_tot = perimeter of circle;
//		return 0;
//	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.1415 * ((radius)*(radius));
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean hasPoint(Point check) {
		// TODO Auto-generated method stub
		boolean flag = false;
	
		
		return false;
	}

}
