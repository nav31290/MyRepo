package com.rbr.general;

public class MyTest1 {
	
	
	static {
		test();
	}
	
	static int i=20;
	
	static void test(){
		//i=30;
		System.out.println("here : "+i);
		//i=30;
	}
	
	public static void main(String[] args) {
		
		System.out.println(" here 1 : "+MyTest1.i);
		MyTest1.test();
		System.out.println(" here 2 : "+MyTest1.i);
		
		
	}
}
