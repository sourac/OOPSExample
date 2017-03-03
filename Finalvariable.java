package com.atul.oops;

public class Finalvariable {
	final int num = 7;

	void meth() {
		/*
		 * final variable is nothing but a constant we cannot change the value
		 * of the final keyword after it initialized
		 */
		num = 8;
	}

	public static void main(String[] args) {
		Finalvariable fv = new Finalvariable();
		fv.meth();
	}

}
