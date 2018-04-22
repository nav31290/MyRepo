package com.rbr.general;

public class ThreadTest implements Runnable{

	int i = 10;
	
	ThreadLocal<Integer> ttLocal = new ThreadLocal<>();
	
	private ThreadLocal myThreadLocal = new ThreadLocal<String>() {
	    @Override protected String initialValue() {
	        return "This is the initial value";
	    }
	};   
	
	public  void run(){
		ttLocal.set(i+50);
		System.out.println(">>>i>>>"+ttLocal.get());
		
	}
	
	public static void main(String[] args) {
		
		ThreadTest tt = new ThreadTest();
		
		Thread t1 = new Thread(tt);
		Thread t2 = new Thread(tt);
		t1.start();
		t2.start();
		
	}


}
