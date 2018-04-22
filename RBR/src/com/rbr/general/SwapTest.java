package com.rbr.general;

public class SwapTest {
	
	static void swap(Employee e1, Employee e2){
		
		Employee temp=new Employee();
		temp.name = e1.name;
		e1.name = e2.name;
		e2.name = temp.name;
		
		System.out.println("e1 : "+e1.name+" e2 : "+e2.name);
		
	}
	
	static void swapUsingWrapper(EmpWrapper empwr1, EmpWrapper empwr2){
		Employee temp;
		temp = empwr1.e;
		empwr1.e = empwr2.e;
		empwr2.e = temp;
		
	}
	
	
	public static void main(String[] args) {
		
		/*Employee e1 = new Employee("ram");
		Employee e2 = new Employee("raj");
		//Employee e3 = new Employee("roshan");
		swap(e1, e2);
		System.out.println("here e1 : "+e1.name+" e2 : "+e2.name);*/
		Employee e1 = new Employee("ram");
		Employee e2 = new Employee("raajan");
		EmpWrapper empwr1 = new EmpWrapper(e1);
		EmpWrapper empwr2 = new EmpWrapper(e2);
		System.out.println("before e1 : "+empwr1.e.name+" e2 : "+empwr2.e.name);
		swapUsingWrapper(empwr1, empwr2);
		System.out.println("after e1 : "+empwr1.e.name+" e2 : "+empwr2.e.name);
	}
}
