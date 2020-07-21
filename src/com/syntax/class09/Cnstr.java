package com.syntax.class09;

public class Cnstr {

	public String name, type;
	int size;
	public boolean exist;

	public void viewInfo() {
		System.out.println("The size of " + name + " " + type + " is " + size + " square km" + ": " + exist);
	}

	Cnstr() {
		System.out.println("Non-parameters");
	}

	Cnstr(String nameObj, String typeObj, int sizeObj, boolean existObj) {
		System.out.println("With parameters");
		name = nameObj;
		type = typeObj;
		size = sizeObj;
		exist = existObj;
	}
	
	public static void main(String[] args) {
		Cnstr objY = new Cnstr();

		objY.name = "Chocolate";
		objY.type = "Ocean";
		objY.size = 200000;
		objY.exist = false;
		objY.viewInfo();
		
		

		Cnstr objX = new Cnstr("Baikal", "Lake", 31722, true);
		objX.viewInfo();

	}

}
