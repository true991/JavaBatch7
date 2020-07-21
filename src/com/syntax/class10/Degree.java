package com.syntax.class10;

public class Degree {
	public void getPrerequisite() {
		System.out.println("To get degree you need high school dimploma");
	}

}

class Bachelors extends Degree {

}

class Masters extends Degree {
	public void getPrerequisite() {
		System.out.println("To get master degree you need university dimploma");
	}
}
