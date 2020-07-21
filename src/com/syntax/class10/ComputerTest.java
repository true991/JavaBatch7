package com.syntax.class10;

public class ComputerTest {
	public static void main(String[] args) {

		Computer[] comps = { new Apple("MacBook", 2020), new Lenovo("LN215", 2017), new HP("GameVersion", 2019), new Dell("XS300", 2009) };
		
		
		for (Computer x : comps) {
			x.batteryLife();
			x.displaySize();
			x.laptop();			
		}

	}

}
