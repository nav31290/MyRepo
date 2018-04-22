package com.rbr.general;

public class NameRunnable implements Runnable {

	@Override
	public void run() {
		
		System.out.println("namerunnable running");
		//Thread t1 = new Thread();
		//Thread.currentThread().stop();
		System.out.println("Run by : "+Thread.currentThread().getName());

	}

}

class NameThread{
	
	public static void main(String[] args) throws Exception {
		
		
		
		NameRunnable nr  = new NameRunnable();
		Thread t = new Thread(nr);
		Thread t1 = new Thread(nr);
		t.setName("fred");
		t1.setName("ricky");
		
		t.start();
		//System.out.println("main method before...");
		t.join();
		t1.start();
		//t1.join();
		
		System.out.println(Thread.currentThread().getName());
		Thread.yield();
		
		System.out.println("main method executing...");
		
				
		
	}
	
}