package com.rbr.intvw.tree;

public class EmpTest {
	
	int age;
	String name=null;
	EmpTest ete;
	
	public static void main(String[] args) {
		
		EmpTest et = new EmpTest();
		et.age = 10;
		et.name = "hello";
		EmpTest et1 = new EmpTest();
		et.ete = et1;
		System.out.println(et.name);
	}
}
