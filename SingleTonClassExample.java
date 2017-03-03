package com.atul.oops;

public class SingleTonClassExample {

	private static SingleTonClassExample obj;

	private SingleTonClassExample() {

	}

	public static void main(String[] args) {
		SingleTonClassExample stce = SingleTonClassExample.getInstance();
		stce.doSomeThing();
	}

	private void doSomeThing() {
		System.out.println("SingleTonClass Bitches");
	}

	private static SingleTonClassExample getInstance() {

		if(obj==null){
			obj=new SingleTonClassExample();
		}
		
		return obj;
	}

}
