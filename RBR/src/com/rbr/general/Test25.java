package com.rbr.general;

public class Test25 {
	
	void test1(){
		boolean bool = true;

		do{

			if(true){
				System.out.println("returning");
				return;
			}

		}while(bool);

	}
	
	void test2(){
		test1();
	}
	
	public static void main(String[] args) {
		
		Test25 t25 = new Test25();
		t25.test2();
		
	}
}
