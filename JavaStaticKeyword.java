package com.atul.oops;

public class JavaStaticKeyword {

	/*
	 * 1. the static variable is used to refer the common property of all
	 * objects. that it is shared between all the objects 2. the static variable
	 * gets memory only once in class area at the time of class loading
	 * 
	 * advantage of using static variable is that it mkes program memory
	 * efficient
	 */

	String name;
	int rollno;
	static String collegeName = "BSA";

	public JavaStaticKeyword(String name, int rollno) {

		this.name = name;
		this.rollno = rollno;

	}

	void display() {
		System.out.println(name + " " + rollno + " " + collegeName);

	}

	public static void main(String[] args) {
		JavaStaticKeyword jsk = new JavaStaticKeyword("Atul", 17);
		JavaStaticKeyword jsk1 = new JavaStaticKeyword("barkha", 19);

		jsk.display();
		jsk1.display();

	}

}
