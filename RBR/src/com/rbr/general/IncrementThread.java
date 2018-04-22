package com.rbr.general;

public class IncrementThread extends Thread{
	
	private Counter counter;
	
	public IncrementThread(Counter counter){
		
		this.counter = counter;
		
	}
	
	public void run(){
		
		for(int i=0; i<10000; i++){
			counter.increment();
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		Counter counter  = new Counter();
		IncrementThread it1 = new IncrementThread(counter);
		IncrementThread it2 = new IncrementThread(counter);
		
		it1.start();
		it2.start();
		it1.join();
		it2.join();
		
		System.out.println(counter.getValue());
		
	}
}
