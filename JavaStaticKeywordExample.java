package com.atul.oops;

public class JavaStaticKeywordExample {
	static int count = 0;

	/*
	 * since instance gets the memory at the object creation. every object has
	 * it's own copy of instance variable. so the increment won't reflect so
	 * inorder to make it reflect the value make it static variable as static
	 * variable will get the memory only once so if nay object changes the value
	 * of the static variable it will retain the value
	 */

	public JavaStaticKeywordExample() {
		count++;
		System.out.println(count);

	}

	public static void main(String[] args) {
		JavaStaticKeywordExample jsk1 = new JavaStaticKeywordExample();
		JavaStaticKeywordExample jsk2 = new JavaStaticKeywordExample();
		JavaStaticKeywordExample jsk3 = new JavaStaticKeywordExample();

	}

}
