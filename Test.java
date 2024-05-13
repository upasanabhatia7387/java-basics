package MultipleInheritanceInterface;

public class Test implements A,B{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.test();
		

	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		
	}
	
	//overriding default method since interface A and B has same test method. if it had test() and test1() then was ok.
	@Override
	public void test() {
		A.super.test();
		//B.super.test();
	}

}
