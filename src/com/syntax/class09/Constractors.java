package com.syntax.class09;

public class Constractors {
	String word;
	
	public Constractors() {
		System.out.println("I am a non args constractor");
	}
	
	public Constractors(String word) {
		this(12, word);
		this.word = word;
	}
	
	public Constractors(int num) {
		System.out.println("Constractors with num = " + num);
	}
	
	public Constractors(int num, String word) {
		System.out.println("Constractors with " + num + " and " + word);
	}
	
	public static void main(String[] args) {
		Constractors obj = new Constractors("JAVA");
		System.out.println(obj.word);
	}

}
