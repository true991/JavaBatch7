package group.syntax01;

public class Average {
	public static void main(String[] args) {
		
		A stud1 = new A(79, 77, 60);
		System.out.println(stud1.getPercentage() + " %");

		B stud2 = new B(40, 55, 68, 99);
		System.out.println(stud2.getPercentage() + " %");
	}

}

abstract class Marks {

	public int a, b, c, d;

	Marks(int a, int b, int c) {

		this.a = a;
		this.b = b;
		this.c = c;

	}

	Marks(int a, int b, int c, int d) {

		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;

	}

	abstract double getPercentage();

}

class A extends Marks {

	A(int a, int b, int c) {
		
		super(a, b, c);

	}

	public double getPercentage() {

		return (a + b + c) / 3;
	}

}

class B extends Marks {

	B(int a, int b, int c, int d) {
		
		super(a, b, c, d);
	}

	public double getPercentage() {

		return (a + b + c + d) / 4;
	}

}
