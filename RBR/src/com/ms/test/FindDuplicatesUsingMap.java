package com.ms.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicatesUsingMap {
	
	
	static void findDup(List<String> list){
		HashMap<String, Integer> hm = new HashMap<>();
		
		for(String s : list){
			if(hm.containsKey(s)){
				hm.put(s, hm.get(s)+1);
			}
			else{
				hm.put(s, 1);
			}
			
		}
		
		for(Map.Entry<String, Integer> hme : hm.entrySet()){
			System.out.println("key  : "+hme.getKey()+" value : "+hme.getValue());
		}
		
	}
	
	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		al.add("ram");
		al.add("shyam");
		al.add("ram");
		al.add("ghanshyam");
		al.add("ghanshyam");
		al.add("ghanshyam");
		
		findDup(al);
	}
}
