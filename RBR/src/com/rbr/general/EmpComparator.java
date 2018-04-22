package com.rbr.general;

import java.util.Comparator;

public class EmpComparator implements Comparator<Employee>{


	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o2.name.compareTo(o1.name);
	}

}
