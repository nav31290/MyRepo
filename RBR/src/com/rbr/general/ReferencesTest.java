package com.rbr.general;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ReferencesTest {
	
	
	public static void main(String[] args) throws InterruptedException {
	
		Employee emp = new Employee("navneet");
		Employee emp1 = new Employee("abcd");
		/*
		SoftReference<Employee> sref = new SoftReference<Employee>(emp);
		
		emp = null;
		
		System.gc();
		
		Thread.sleep(10000);
		
		System.out.println(sref.get().name);*/
		
		/*WeakReference<Employee> wkr = new WeakReference<Employee>(emp);
		
		WeakHashMap<Employee, String> hm = new WeakHashMap<>();
		hm.put(wkr, wkr);
		 * 
		hm.put("two", emp1);
		hm.put(wkr, "one");
		
		emp=null;
		
		for(Map.Entry<String, Employee> me : hm.entrySet()){
			System.out.println(me.getKey()+" "+me.getValue());
		}
		
		ConcurrentHashMap<K, V>*/
		
		ArrayList<String> al = new ArrayList<>();
		al.add("nav");
		al.add("abhi");
		
		Collections.sort(al);
		System.out.println(al.toString());
		
		
		
		
		
	}
}
