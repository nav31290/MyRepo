package com.rbr.general;

public class Employee {
	
	int id;
	
	String name;
	
	public Employee(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public Employee(String name, int id) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.id = id;
	}

	/*@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
		
	}*/
	
}
