package com.thread;

public class DeadLockTest {

	public static void main(String[] args) {
		DeadLockTest test = new DeadLockTest();

		final A a = test.new A();// because A is inner class of DeadLockTest
		final B b = test.new B();// because B is inner class of DeadLockTest
		// A a1 =new A();
		// B b1=new B();
		// Thread-1
		Runnable block1 = new Runnable() {
			public void run() {
				synchronized (a) {
					try {
						System.out.println("Block-1 Start");
						// Adding delay so that both threads can start trying to
						// lock resources
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					// Thread-1 have A but need B also
					synchronized (b) {
						System.out.println("In block 1 End");
					}
				}
			}
		};

		// Thread-2
		Runnable block2 = new Runnable() {
			public void run() {
				synchronized (a) {
					System.out.println("Block 2 start ");
					// Thread-2 have B but need A also
					synchronized (b) {
						System.out.println("In block 2 End");
					}
				}
			}
		};

		new Thread(block1).start();
		new Thread(block2).start();
	}

	// Resource A
	private class A { // inner class
		private int i = 10;

		public int getI() {
			return i;
		}

		public void setI(int i) {
			this.i = i;
		}
	}

	// Resource B
	private class B { // inner class
		private int i = 20;

		public int getI() {
			return i;
		}

		public void setI(int i) {
			this.i = i;
		}
	}
}

//package com.thread;
//
//public class DeadLockTest {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		DeadLockTest test = new DeadLockTest();
//		
//		final A a=test.new A();//since A is inner class of the deadlock
//		final B b= test.new B();//since B is inner class of the deadlock
//		
//		//Thread-1
//		Runnable block1 = new Runnable() {
//			public void run() {
//				synchronized (a) {
//					try {
//						System.out.println("Block-1 strat");
//						Thread.sleep(100);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					synchronized(b) {
//						System.out.println("In Block-1 end");
//					}
//					
//				}
//			}
//		};
//		//thread-2
//		Runnable block2 = new Runnable() {
//			public void run() {
//				synchronized (a) {
//					System.out.println("Block-2 Start");
//					}
//					synchronized (b) {
//						System.out.println("In Block-2 end");
//					}
//					
//				}
//			};
//		
//		new Thread(block1).start();
//		new Thread(block2).start();
//	}
//}
//
////Resource A
//private class A{//inner class
//	private int i =10;
//	
//	public int getInt() {
//		return i;
//	}
//	
//	public void setInt(int i) {
//		this.i=i;
//	}
//}
//
////Resource B
//private class B{//inner class
//	private int i =20;
//	
//	public int getInt() {
//		return i;
//	}
//	
//	public void setInt(int i) {
//		this.i=i;
//	}
//}