package java11feature;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Java11Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee(101,"Allen", 73636f));
		emp.add(new Employee(102,"Black", 7668f));
		
		System.out.println(emp);
		
		System.out.println("----------");
		
		Employee[] array = emp.toArray(size-> new Employee[size]);
		
		Employee[] array1 = emp.toArray(Employee[]::new);
		
		System.out.println(array[0]);
		
		var msg = 100.5;
		System.out.println(msg);
		
		BiFunction<String, Integer, String> result = (var x, var y)->{
			System.out.println(x+","+y);
			return "Hello"+"How";
		};
		System.out.println(result.apply("10", 20));
	}

}
