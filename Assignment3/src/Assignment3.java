
public class Assignment3 {
public static void main(String[] args) {
	Point A = new Point(1,1);
	Point B = new Point(2,2);
	Point D = new Point(4,6);
	Point E = new Point(30,34);
	System.out.println("The point A has coordinates " + A);
	Line AB = new Line(A,B);
	System.out.println(AB);
	AB.scale(3,4);
	System.out.println("The line AB scaled by 3,4 is " + AB);
	Rectangle newrect = new Rectangle(A, 3,5);
	System.out.println(newrect);

	Circle C = new Circle(A,3);
	System.out.println(C);
	C.scale(3);
	System.out.println("Circle c with a scale factor of 3 is "+  C);
	Rectangle newrect2 = new Rectangle(B,6,20);
	Rectangle overlap = newrect.overlap(newrect2);
	System.out.println("overlap of newrect and newrect 2 is " + overlap);
	System.out.println("does circle C contain B?: " + C.hasPoint(B));
	System.out.println("does circle C contain D?: "+ C.hasPoint(D));
	System.out.println("does rectangle newrect contain point B?: "+  newrect.hasPoint(B));
	System.out.println("does rectangle newrect2 contain point E? : " + newrect2.hasPoint(E));
	newrect.scale(2,4);
	System.out.println("The rectangle new rect scaled by 2,4 is" + newrect);
}
}
