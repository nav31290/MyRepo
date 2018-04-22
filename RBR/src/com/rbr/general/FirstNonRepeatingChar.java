package com.rbr.general;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatingChar {
	
	static char firstNonRepChar(String str){
		
		Map<Character, Integer> lMap = new LinkedHashMap<>();
		Character res=null;
		for(int i=0; i<str.length(); i++){
			
			if(lMap.get(str.charAt(i)) != null){
				lMap.put(str.charAt(i), lMap.get(str.charAt(i))+1);
			}
			else{
				lMap.put(str.charAt(i), 1);
			}
			
		}
		
		for (Map.Entry<Character, Integer> entry : lMap.entrySet()) {
			
			if(entry.getValue()==1){
				System.out.println("first non rep char "+entry.getKey() );
				res =  entry.getKey();
				return res;
			}
			
		}
		
		return res;
		
	}
	
	public static void main(String[] args) {
		String str = "abcdefhabc";
		Character res = FirstNonRepeatingChar.firstNonRepChar(str);
		System.out.println(res);
		
	}
	
}
