package group.syntax01;

public class Automobile {
	public static void main(String[] args) {

		Sedan a = new Sedan(90000, "Blue", 19);
		System.out.println(a.calculateSalePrice());

		Sedan b = new Sedan(100000, "Silver", 24);
		System.out.println(b.calculateSalePrice());

		Truck c = new Truck(140000, "Black", 2400);
		System.out.println(c.calculateSalePrice());

		Truck d = new Truck(70000, "White", 1700);
		System.out.println(d.calculateSalePrice());

	}

}

abstract class Car {
	int carPrice;
	String color;

	Car(int carPrice, String color) {
		this.carPrice = carPrice;
		this.color = color;

	}

	abstract double calculateSalePrice();
}

class Sedan extends Car {
	int length;

	Sedan(int carPrice, String color, int length) {
		super(carPrice, color);
		this.length = length;
	}

	@Override
	public double calculateSalePrice() {
		if (length > 20) {
			return carPrice - (carPrice * 0.05);
		} else {
			return carPrice - (carPrice * 0.10);
		}
	}

}

class Truck extends Car {
	int weight;

	Truck(int carPrice, String color, int weight) {
		super(carPrice, color);
		this.weight = weight;
	}

	@Override
	public double calculateSalePrice() {

		if (weight > 2000) {
			return carPrice - (carPrice * 0.10);
		} else {
			return carPrice - (carPrice * 0.20);
		}
	}

}
