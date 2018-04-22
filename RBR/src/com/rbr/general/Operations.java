package com.rbr.general;

public class Operations {
	
	public static Object divide(Object a, Object b){
		Object c=0;
		try{
			c = Math.div
			//Double k = Double;
		}catch(ArithmeticException e){
			System.out.println("arithmetic exception");
			e.printStackTrace();
		}
		catch(IllegalArgumentException ile){
			System.out.println("Illegal arg exception");
			ile.printStackTrace();
		}catch(Exception e1){
			System.out.println("general exception");
			e1.printStackTrace();
		}
		//System.out.println(c);
		return c;
		
	}
	
	public static void main(String[] args) {
		/*Double p = new Double(1);
		Double q = new Double(0);*/
		//System.out.println(divide(p,q));
		int p =1;
		int q= 0;
		System.out.println(divide(p,q));
	}
	
}