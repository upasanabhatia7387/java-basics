package MultipleInheritanceInterface;

public interface A {
	void calculate();
	default void test() {
		System.out.println("A test");
	}
}
