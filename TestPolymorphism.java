package com.atul.oops;

public class TestPolymorphism {

	public static void main(String[] args) {
		RBIPolymorphism rbi = new SBIPolymorphism();
		RBIPolymorphism rbi1 = new HDFCPolymorphism();

		System.out.println("SBI interest : " + rbi.getInterest());
		System.out.println("HDFC interest : " + rbi1.getInterest());

	}
}
