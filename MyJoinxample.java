package com.thread;

class MyThread11 extends Thread{
	public void run() {
		for (int i=0;i<10;i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

public class MyJoinxample {

	public static void main(String[] args) throws InterruptedException{
		MyThread11 t = new MyThread11();
		MyThread11 t1 = new MyThread11();
		t.start();
		t1.start();
		t.join(); //daemon thread
		
		
		for (int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}

	}

}
