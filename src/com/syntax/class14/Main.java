package com.syntax.class14;

class SyntaxStudentException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SyntaxStudentException(String message) {
		super(message);

	}

}

class Main {

	public void check(int grade) throws SyntaxStudentException {
		if (grade > 90)
			throw new SyntaxStudentException("You are an exceptionally awesome student");

	}

	public static void main(String[] args) {

		Main a = new Main();
		try {
			a.check(91);
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}

}