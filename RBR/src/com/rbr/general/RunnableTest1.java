package com.rbr.general;

public class RunnableTest1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =1; i<=100; i++){
			System.out.println("count : "+i);
			if(i%10==0)
				System.out.println("hello moto");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

 
