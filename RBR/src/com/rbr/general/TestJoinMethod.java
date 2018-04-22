package com.rbr.general;

public class TestJoinMethod implements Runnable{
	
	public void run(){
		
		for(int i=0; i<=5; i++){
			
			System.out.println("exec : "+i+" thrwad : "+Thread.currentThread().getName()+" priority : "+Thread.currentThread().getPriority());
		
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		TestJoinMethod tm = new TestJoinMethod();
		
		Thread t1 = new Thread(tm);
		Thread t2 = new Thread(tm);
		Thread t3 = new Thread(tm);
		
		t1.start();
		
		//t1.join();
		
		t2.start();
		
		t2.join();
		
		t3.start();
		
		
		
	}
	
}
