package com.atul.oops;

public class Encapsulation {
	
	private int age;
	private String name;
	private String address;
	
	/*Encapsulation is done to hide the implementation details
	 *from the user. to achieve encapsulation all the data memeber are made private and 
	 *the access to them is provided throught he public methods i.e getter and setter methods.  */
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
