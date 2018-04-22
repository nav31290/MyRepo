package com.rbr.general;

public class Test27 {
	
	public static void main(String[] args) throws Exception{
		
		
		try{
			System.out.println("hello");
			throw new Exception();
		}catch(Exception e){
			System.out.println("in exce");
		}
		
	}
}
