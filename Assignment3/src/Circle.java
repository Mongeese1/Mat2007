
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
		this.point_pt.x= point_pt.x+dx;
		this.point_pt.y = point_pt.y+dy;
		
	}

	
	
	@Override
	public void scale(double factor) {
		// TODO Auto-generated method stub
		this.radius = radius*factor;
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
		return 3.1415 * Math.pow(radius,2);
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*3.1415 * radius;
	}

	@Override
	public boolean hasPoint(Point check) {
		// TODO Auto-generated method stub
		boolean flag = false;
		double dist = Math.pow(radius, 2) - (Math.pow(point_pt.x- check.x,2)) - (Math.pow(point_pt.y-check.y, 2));
		if(dist>=0) {
			flag = true;
		}
		return flag;
		
		
	}

	@Override
	public void scale(double sx, double sy) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		String str = "The circle has a centre of " + this.point_pt + " with a radius of " + this.radius + " and a permiter of " + this.perimeter() + " and an area of " + this.area();
		return str;
	}

}
