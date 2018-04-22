package com.rbr.general;

public class Multi extends Thread{
	
	public void run(){
		System.out.println("thread is started...");
	}
	
	public static void main(String[] args) {
		
		Multi t1  = new Multi();
		t1.start();
		
	}

}
