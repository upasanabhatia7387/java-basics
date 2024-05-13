package com.thread;
class MyThread3 extends Thread {
	@Override
	public void run() {
		Thread.currentThread().setName("T-1");
		Thread.currentThread().setPriority(6);
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread "+","+ Thread.currentThread().getName());
		}
		System.out.println(Thread.currentThread().getPriority());
	}
}

class MyThread4 extends MyThread implements Runnable {
	@Override
	public void run() {
		Thread.currentThread().setName("T-2");
		Thread.currentThread().setPriority(7);
		for (int i = 0; i < 10; i++) {
			System.out.println("Child-1Thread " + Thread.currentThread().getName());
		}
		System.out.println(Thread.currentThread().getPriority());
	}
}

public class MythreadPriority {
	public static void main(String arg[]) {
		MyThread3 t = new MyThread3();
		//MyThread3 t1 = new MyThread3();
		MyThread4 t2 = new MyThread4();
		Thread t3= new Thread(t2);
		System.out.println(t.getPriority());
		t.start();
		//t1.start();
		//t2.start();
		t3.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread " + Thread.currentThread().getName());
		}
	}
}

//package com.thread;
//
//class MyThread3 extends Thread{
//	@Override
//	public void run () {
//		Thread.currentThread().setName("T-1");
//		for (int i=0;i<10;i++) {
//			//System.out.println(Thread.currentThread().getPriority());
//			System.out.println("CHild thread" + "," + Thread.currentThread().getName());
//		}
//	}
//}
//
//public class MythreadPriority {
//
//	public static void main(String[] args) {
//		Thread.currentThread().setName("T-1");
//		MyThread3 t = new MyThread3();
//		System.out.println(t.getPriority());
//		t.setPriority(10);
//		t.start();
//		for (int i=0;i<10;i++) {
//			System.out.println("Main thread");
//		}
//
//	}
//
//}
