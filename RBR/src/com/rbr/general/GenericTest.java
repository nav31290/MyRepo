package com.rbr.general;

public class GenericTest<T> {
	
	T abc;
	
	   void hello(T str){
		System.out.println("str :: "+str);
	}
	 
	 public static void main(String[] args) {
		GenericTest<String> gt = new GenericTest<>();
		gt.hello(1);
	}
}
