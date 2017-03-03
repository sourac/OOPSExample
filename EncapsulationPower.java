package com.atul.oops;

public class EncapsulationPower {
	
	public static void main(String[] args) {
		
		Encapsulation ec=new Encapsulation();
		ec.setAge(20);
		ec.setName("atul");
		ec.setAddress("india");
		
		System.out.println("name : " +  ec.getName());
		System.out.println("age : " + ec.getAge());
		System.out.println("address : " + ec.getAddress());
	}

}
