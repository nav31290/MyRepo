package com.rbr.general;

public class Multi3 implements Runnable{

	@Override
	public void run() {
		System.out.println("threadrunning...");
		
		
	}
	
	synchronized void abc(){
		
	}
	
 void abc1(){
		
	}
	
	
	
	public static void main(String[] args) {
		
		Multi3 m1  = new Multi3();
		
		Multi3 m2  = new Multi3();
		
		Thread t2  = new Thread(m1);
		
		Thread t1  = new Thread(m1);
		
		Thread t3  = new Thread(m2);
		
		t1.start();
		
		t2.start();
		
		t3.start();
	}

}
