package group.syntax01;

public class Geometrique {
	public static void main(String[] args) {

		Shape a = new Circle();

		a.calculateArea(5);
		a.calculatePerimiter(5);

		Shape b = new Square();

		b.calculateArea(4);
		b.calculatePerimiter(4);

	}

}

interface Shape {

	void calculateArea(int a);

	void calculatePerimiter(int a);

}

class Circle implements Shape {

	public void calculateArea(int radius) {
		
		int diametr = radius * 2;
		double s = (3.14 * (diametr * diametr)) / 4;

		System.out.println("The area is " + s);

	}

	public void calculatePerimiter(int radius) {
		
		int diametr = radius * 2;

		double p = 3.14 * diametr;

		System.out.println("The perimiter is " + p);

	}

}

class Square implements Shape {

	public void calculatePerimiter(int a) {

		System.out.println("The perimiter is " + (a * 4));

	}

	public void calculateArea(int a) {
		
		System.out.println("The area is " + (a * a));
	}

}
