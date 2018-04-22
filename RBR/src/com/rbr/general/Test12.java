package com.rbr.general;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test12 {
	
	int i=0;
	
	void test() throws Exception{
		
		
		
	}
	
	public static void main(String[] args) throws Exception{
	
		/*String strtDate = "03/12/2016";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date stDte = sdf.parse(strtDate);
		System.out.println(stDte);
		
		Calendar cal = Calendar.getInstance();
		cal.add(stDte, -2);
		stDte = cal.getTime();
		
		System.out.println("strt date now : "+stDte);*/
		/*
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -100);
		System.out.println("date here : "+cal.getTime());*/
		System.out.println("::: "+2.0/0.0);
		
	}
}
