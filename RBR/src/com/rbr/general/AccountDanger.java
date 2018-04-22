package com.rbr.general;

public class AccountDanger implements Runnable{

	private Account acct = new Account();
	
	
	@Override
	public void run() {
		
		for(int x =0 ;x<5; x++){
			makeWithdraw(10);
			if(acct.getBalance() < 0){
				System.out.println("account is overdrawn");
			}
		}
		
	}
	
	private synchronized void makeWithdraw(int amt){
		
		if(acct.getBalance() >= amt){
			System.out.println(Thread.currentThread().getName()+" is going to withdraw");
		
		
		try{
			Thread.sleep(500);
		}catch(Exception e){
			
		}
		
		acct.withdraw(amt);
		System.out.println(Thread.currentThread().getName()+" completes the withdraw");
		}
		else{
			System.out.println("Not enough to withraw for "+Thread.currentThread().getName()+" amount is"+acct.getBalance());
		}
		
	}
	
	public static void main(String[] args) {
		
		AccountDanger ad = new AccountDanger();
		Thread t1 = new Thread(ad);
		Thread t2 = new Thread(ad);
		t1.setName("Fred");
		t2.setName("Lucy");
		
		t1.start();
		t2.start();
	}

	
	
}
