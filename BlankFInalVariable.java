package com.atul.oops;

public class BlankFInalVariable {

	
	/* a final variable are not initialized at the
	 * time of declaration are known as blank final variable
	 * if you want to create a variable whichc is initialized at 
	 * the time of object creation and after that it should not change.
	 * use blank final variable f.ex PAN CARD */
	final int employeeId;

	public BlankFInalVariable(int id) {

		this.employeeId = id;
	}

	public static void main(String[] args) {
		BlankFInalVariable bfv = new BlankFInalVariable(5);
		System.out.println("employee id : " + bfv.employeeId);

	}

}
