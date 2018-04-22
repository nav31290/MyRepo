package com.rbr.general;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.*;

public class Test {
	
	/*String s = "hello";
	
	public String getRet(int k){
		return "abc";
	}
	
	public void getSet(){
		System.out.println("get set");
		System.out.println(getRet("nshhj"));
		System.out.println("after...");
	}
	
	public String getRet(String d){
		try{
			String s = "navneet";
			return s;
		}
		catch(Exception e){
			
		}
	}	*/
	
	public static void main(String[] args) throws Exception{
	/*	LinkedList<E>*/
		
		/*HashSet<String> hs = new HashSet<>();
		hs.add("hello");
		hs.add("khello");
		hs.remove(new String("hello"));
		
		HashMap<String, Object> hm = new HashMap<>();
		hm.put("hello", new Object());
		hm.put("hello", new Object());
		
		System.out.println(hs.size());
		
		
			System.out.println(hs);*/
			
		/*Test t = new Test();
		t.getSet();*/
			
		/*TreeMap<String, Object> tm  = new TreeMap<>();
		LinkedHashMap<String, Object> lhm = new LinkedHashMap<>();
		lhm.put(key, value);
		
		CopyOnWriteArraySet<E>*/
		
		/*throw new Exception();
		String accName = "Bus First Transact 00";
		System.out.println(accName.contains("Bus First"));
		*/
	/*	String str = "abcd";
		System.out.println(str.substring(1,4));*/
		/*int n = str.length();
		for (int i = 0; i < n; i++){
		 System.out.println(str.charAt(i));
		 System.out.println(str.substring(0, i));
		 System.out.println(str.substring(i+1, n));
		 System.out.println(str.substring(0, i) + str.substring(i+1, n));
		 System.out.println("*************************8");
		}*/
		/*String s1 = "abc";
		String s2 = new String("abc");
		s2 = s2.intern();
		System.out.println(s1 ==s2);*/
		/*String str = "c";
		System.out.println(str.charAt(1));*/
		
		
		/*String name = "ANZ KiwiSaver Scheme";
		System.out.println(name.substring(0,1));*/
		/*if(name.toLowerCase().indexOf("saver") >= 0){
			System.out.println("found");
		}*/
		/*String accNum = "Account number 01-0414-0673838-01";
		 if(accNum.contains("Account number")){
				 
				 accNum = accNum.substring(accNum.indexOf("number")+6).trim();
			 }
		 System.out.println(":::"+accNum);*/
		/*String runBal = "-94.90";
		//runBal = runBal.replaceAll("$", "");
		System.out.println("runnn balll "+runBal);
		Double rBal = Double.parseDouble(runBal);
		System.out.println(":::"+rBal);*/
		String accountName = "Homeloan repayments";
		if((accountName.toUpperCase().contains("HOME LOAN") && !accountName.toUpperCase().contains("OFFSET") && !accountName.toUpperCase().contains("REPAYMENTS"))||(accountName.toUpperCase().contains("LOAN") &&
				 !accountName.toUpperCase().contains("OFFSET")&& !accountName.toUpperCase().contains("CAMPER") && !accountName.toUpperCase().contains("REPAYMENTS"))|| accountName.toUpperCase().contains("OVERDRAFT")||accountName.toUpperCase().contains("EQUITY ACCESS")
				||accountName.toUpperCase().contains("LOC")|| accountName.toUpperCase().contains("HELOC")
				||accountName.toUpperCase().contains("TRACKER HL")||accountName.toUpperCase().contains("RATE TRACKER")||accountName.toUpperCase().contains("MOONLIGHT STREET")
				|| accountName.toLowerCase().contains("pinewood street property") || accountName.toLowerCase().contains("caloundra property")
				|| accountName.toLowerCase().contains("2/26 ronald st") || accountName.toLowerCase().contains("daleys point large") || accountName.toLowerCase().contains("daleys point small") 
				|| accountName.toLowerCase().contains("lane cove large") || accountName.toLowerCase().contains("lane cove small") || accountName.toLowerCase().contains("thompson crescent heights")
				|| accountName.toLowerCase().contains("37 seabreeze avenue") || accountName.toLowerCase().contains("33 houghton drive")||accountName.toLowerCase().contains("bankwest equaliser")){
			System.out.println("loan...");
		}
		
		
	}
}
