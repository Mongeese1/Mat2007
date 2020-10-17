
public class Rectangle implements Geometry,hasArea{
	
	Point pt;
	double h;
	double w;
	
	public Rectangle() {}
	
	public Rectangle(Point corner , double height, double width) {
		this.pt = corner;
		this.h=height;
		this.w=width;
	}
	
	@Override
	public Point centroid() {
		// TODO Auto-generated method stub
		Point centre = new Point();
		centre.x = h/2;
		centre.y = w/2;
		
		return centre;
	}

	@Override
	public Rectangle bound() {
		// TODO Auto-generated method stub
		Rectangle boundrect = new Rectangle();
		if(this.h<0) {
			boundrect.h = -this.h;
			boundrect.w = -this.w;
			boundrect.pt = this.pt;
		}
		else {
			boundrect.h = this.h;
			boundrect.w = this.w;
			boundrect.pt = this.pt;
		}
		return boundrect;
	}
	public Rectangle overlap(final Rectangle other) {
		Rectangle overlp = new Rectangle();
		if(other.pt.x < this.w && other.pt.y < this.h) {
			overlp.pt = other.pt;
			overlp.h = other.h - this.h;
			overlp.w = other.w -this.w;
		}
		else if(this.pt.x<other.h && this.pt.y<other.w) {
			overlp.pt = this.pt;
			overlp.h = this.h - other.h;
			overlp.w = this.w - other.w;
		}
		else {
			return null;
		}
		return overlp;
	}

	@Override
	public void translate(double dx, double dy) {
		// TODO Auto-generated method stub
		this.pt.x = pt.x+dx;
		this.pt.y = pt.y+dy;
		
	}

	@Override
	public void scale(double sx, double sy) {
		// TODO Auto-generated method stub
		this.h = sx*h;
		this.w = sy*w;
		
	}

//	@Override
//	public double length() {
		// TODO Auto-generated method stub
	
//		double p_tot = (this.h+this.w) * 2;
//		return p_tot;
//	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		double area = this.w * this.h;
		return area;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return this.h * 2 + this.w *2;
	}

	@Override
	public boolean hasPoint(Point check) {
		// TODO Auto-generated method stub
		boolean flag = false;
		if(check.x >this.pt.x && check.x < this.w && check.y >this.pt.y&&check.y<this.h) {
			flag = true;
		}
		return flag;
	}

	@Override
	public void scale(double scale) {//circle scale unused here
		// TODO Auto-generated method stub
	}
	@Override
	public String toString() {
		String str = "The rectangle has a corner point "  + this.pt + " and a height and width of " + this.h + " , " + this.w + " Its area is "  + this.area() +" and its perimeter is " + this.perimeter();
		
		return str;
	}
}
