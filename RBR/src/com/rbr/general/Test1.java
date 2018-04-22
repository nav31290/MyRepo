package com.rbr.general;

public class Test1 {
	private static int i=10;
	private int j=20;
	
	private static void hello(){
		System.out.println(i);
		
		System.out.println(new Test1().j);
	}
	
	private void bye(){
		System.out.println(i);
		System.out.println(j);
	}

	public static void main(String[] args) {
		i=20;
		new Test1().j=60;
		hello();
		new Test1().bye();
		
	}
}
