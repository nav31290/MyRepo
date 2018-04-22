package com.rbr.general;

public class DeadLockTest {
	
	public static void main(String[] args) {
		
		final String resource1 = "navneet";
		final String resource2 = "aniket";
		
		Thread t1 = new Thread(){
			@Override
			public void run(){
				synchronized(resource1){

					System.out.println("resource : 1 here acquired by thread"+Thread.currentThread().getName());
					try{
						Thread.sleep(500);
					}catch(Exception e){

					}

					synchronized(resource2){

						System.out.println("resource : 2 here acquired by thread"+Thread.currentThread().getName());
					}
				}
				
			}
			
		};
		
		Thread t2 = new Thread(){
			@Override
			public void run(){
				synchronized(resource2){

					System.out.println("resource : 2 acquired by thread"+Thread.currentThread().getName());
					try{
						Thread.sleep(500);
					}catch(Exception e){

					}


					synchronized(resource1){

						System.out.println("resource : 1 acquired by thread"+Thread.currentThread().getName());
					}
				}
			}
			
		};
		
		t1.start();
		t2.start();
		
		
		
	}
	
}
