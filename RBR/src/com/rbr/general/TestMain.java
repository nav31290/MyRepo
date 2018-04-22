package com.rbr.general;

class TestMain{
	public static void main(String[] args) {

		RunnableTest1 rt = new RunnableTest1();
		Thread t = new Thread(rt);
		t.start();

	}
}
