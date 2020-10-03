package tutorial5;

public class Rectangle {

	
	int h;//height
	int w;//width
	int x; //xpos
	int y; //ypos

	public Rectangle(){
		this.h = 4;
		this.w = 12;
	}
	public Rectangle(int height, int width, int x, int y) {
		this.h = height;
		this.w = width;
		this.x = x;
		this.y = y;
				}
	public float area() {
		float A = h*w;
		return A;
		
	}
	public void move_rect(int movx, int movy) {
		x = x+movx;
		y=y+movy;
		
	}
	public void change_rect(int addh, int addw) {
		h = h+addh;
		w = w+addh;
	}
	public Rectangle add_rect(Rectangle rect1) {	
		Rectangle new_rect = new Rectangle((rect1.h+h),(rect1.w+w),(rect1.x+x),(rect1.y+y));
		return new_rect;
	}
	public void print_rect(Rectangle rect) {
		System.out.println("rectangle height is : " + rect.h +"\n" + " rectangle width is : "+ rect.w+ "\n" + "rect x and y pos is: " + rect.x + "," + rect.y + "\n" + "rect area is" + rect.area());
	}
}
