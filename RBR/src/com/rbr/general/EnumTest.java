package com.rbr.general;

public class EnumTest {
	
	public enum Level{
		HIGH,
		MEDDIUM,
		LOW
		
	}
		
	
	public static void main(String[] args) {
		
		Level level1 = Level.HIGH;
		
		if(level1 == Level.HIGH){
			System.out.println("high...");
		}
		
		for(Level l : Level.values()){
			System.out.println(l);
		}
		
	}
	
}
