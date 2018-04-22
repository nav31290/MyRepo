package com.rbr.general;

public class TestSleepMethod implements Runnable{
	
	public void run(){
		
		for(int i=0; i<5; i++){
			
			System.out.println("executing : "+i+" by  : "+Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
		TestSleepMethod tsp = new TestSleepMethod();
		
		Thread t1  = new Thread(tsp);
		t1.start();
		
		TestSleepMethod tsp1 = new TestSleepMethod();
		
		Thread t2  = new Thread(tsp1);
		t2.start();
	}
}
