package com.atul.oops;

public class Bajaj extends Bike {

	@Override
	void run() {
		System.out.println("humara Bajaj");
	}

	public static void main(String[] args) {

		Bike bike = new Bajaj();
		bike.run();

	}
}
