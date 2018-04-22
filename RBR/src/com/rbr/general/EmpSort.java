package com.rbr.general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpSort {
	
	public static void main(String[] args) {
		
		List<Employee> emp = new ArrayList<>();
		Employee e1 = new Employee("raj",3);
		Employee e2 = new Employee("abhay",1);
		Employee e3 = new Employee("sanjay",2);
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		
		
		List<String> al = new ArrayList<>();
		al.add("hewloo");
		al.add("rambo");
		al.add("sid");
		Collections.sort(emp, new EmpComparator());
		
		Collections.swap(list, i, j);
		
	/*	for(String a : al){
			System.out.println(a);
		}
		System.out.println(">> "+('S'-'h'));
		System.out.println(">>>> "+('s'-'h'));*/
		
		for(Employee a : emp){
			System.out.println(a.name);
		}
		
	}
}
