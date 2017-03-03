package com.atul.oops;

public class EmployeeInheritanceBase extends EmployeeInheritance {

	int bonus = 12000;

	public static void main(String[] args) {
		EmployeeInheritanceBase eib = new EmployeeInheritanceBase();
		System.out.println("base salary : " + eib.baseSalary);
		System.out.println("bonus salary : " + eib.bonus);

	}

}
