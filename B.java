package MultipleInheritanceInterface;

public interface B {
	void calculate();
	default void test() {
		System.out.println("B test");
	}

}
