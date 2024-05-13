package java8example;
	
	@FunctionalInterface
	interface A{
		public void test();
		
		default void test1() {
			System.out.println("default test 1");
		}
		
		static void test2() {
			System.out.println("static test 2");
		}
	}
	
	class I1 implements A{

		@Override
		public void test() {
			// TODO Auto-generated method stub
			
		}
		
		//default method cannot be overridden so we have to make it a public method
		@Override
		public void test1() {
			System.out.println("default test 1");
		}
		
		@Override //static method cannot be overridden it gives Compile time error
		static void test2() {
			System.out.println("static test 2");
		}
		
	}
	
	class I2 implements A{
		@Override
		public void test() {
			// TODO Auto-generated method stub
			
		}
		
	}
	public class DefaultAndStaticExample {
}
