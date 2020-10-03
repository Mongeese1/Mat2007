package tutorial5;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect1 = new Rectangle(4,5,1,2);
		rect1.print_rect(rect1);
		Rectangle rect2 = new Rectangle(12,20,2,-5);
		rect2.print_rect(rect2);
		rect2.move_rect(2, 5);
		rect2.change_rect(2, -5);
		rect2.print_rect(rect2);
		Rectangle new_rect = rect2.add_rect(rect1);
		rect2.print_rect(new_rect);

	}

}
