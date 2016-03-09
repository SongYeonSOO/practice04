package prob5;

public class ShapeTest {

	public static void main(String[] args) {

		Rectangle r = new Rectangle(5, 6);
		RectTriangle rt = new RectTriangle(6, 2);
		Shape[] s = { r, rt };
		for (int i = 0; i < s.length; i++) {
			System.out.println("area: " + s[i].getArea());
			System.out.println("perimeter: " + s[i].getPerimeter());
			if (s[i] instanceof Resizable) {
				((Rectangle) s[i]).resize(0.5);
				System.out.println("new area: " + s[i].getArea());
				System.out.println("new perimeter: " + s[i].getPerimeter());
			}

		}

	}
}
