package com.rbr.general;

public class TestShutdownhook {
	public static void main(String[] args) {
		
		Runtime r = Runtime.getRuntime();
		
		r.addShutdownHook(new MyThread());
		
		System.out.println("main method is going to sleep now");
		
		System.exit(0);
		
		System.out.println("after system exit");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
