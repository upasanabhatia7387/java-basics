package java8example;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String, String> f1 = (str) -> str + "Fine"; //one return value and one parameter any value i/p o/p
		System.out.println(f1.apply("hello"));
		//f1.apply("Hello");
		
		BiFunction <String, Integer, String> biF = (a,b) -> a+b; //
		System.out.println(biF.apply("Welcome",10));
		
		Predicate <String> p =(a) -> { //boolean return and any type of obkect as a input
			if (a.length()==4) 
				return true;
			else
				return false;
		};
		boolean result = p.test("Upasana");
		
		System.out.println(result);
		
		Consumer <String> consumer = (str) -> System.out.println("Its consumer " + str);
		consumer.accept("Hello"); //parameter //consumer is like a setter method
		
		Supplier<Integer> su = () -> 10; //is like a getter method
		
		Integer result1 = su.get();
		System.out.println(result1);
				}

}
