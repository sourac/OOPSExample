package com.atul.oops;

public class ConcreteClassForInterface implements A, B {

	public void print() {
		System.out
				.println("achieving multiple inheritance in interface as there is no ambiguity");
	}

	public static void main(String[] args) {
		ConcreteClassForInterface ccfi = new ConcreteClassForInterface();
		ccfi.print();
	}

}
