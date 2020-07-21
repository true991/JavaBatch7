package com.syntax.class08;

public class InstanceVariables {
	String name = "Yuriy =>"; // instance variable

	public static void main(String[] args) {
		String name = "Kristina =>"; // local variable
		System.out.println(name);

		name = "=> Volha"; // re-assigning of local;
		System.out.println(name);
		
		InstanceVariables obj = new InstanceVariables();

		System.out.println(obj.name);

		obj.name = "=> Ed"; // re-assigning of instance;

		System.out.println(obj.name);

	}

}
