package java8example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Employee> elist = Arrays.asList(new Employee(101, "Allen", "HR", 1234l, "NY"),
				new Employee(102, "James", "IT", 6754l, "NJ"), new Employee(103, "Black", "HR", 8786l, "Pitts"),
				new Employee(104, "Max", "IT", 4567l, "NY"));
		
		//sort employee based on salary
		List <Employee> sortedByEmpSal = elist.stream().
				sorted((obj1,obj2) -> obj1.getSalary().compareTo(obj2.getSalary())).collect(Collectors.toList());
		System.out.println(sortedByEmpSal);
		
		//runnable implementation using lambda expression
//		Runnable r = () ->{
//			for (int i=0;i<10;i++) {
//				System.out.println(i);
//			}
//		};
//		Thread t = new Thread(r);
//		t.start();
		
		//find employee whoes name is Allen
		Employee emp  = elist.stream().filter(e ->e.getName().equals("Allen")).findFirst().orElse(null);
		System.out.println(emp.getId()+","+emp.getName()+","+emp.getDept()+","+emp.getSalary()+","+emp.getAddress());
		
		//find the name of the employee whose salary is greater than 20000
		List<String> names = elist.stream().filter(e ->e.getSalary()>20000).map(emp1 -> emp1.getName())
				.collect(Collectors.toList());
		System.out.println(names);
		
		//find the address of all the employee
		List<String> address = elist.stream().map(e->e.getAddress()).collect(Collectors.toList());
		System.out.println(address);
		
		//
		String input = "JavaJavaEE"; //j:2, a:4 
		
		//1. convert strings to char array
		//2. we have to map each character from the array
		//3. we have to char array into Map
		
		Map<Character, Long> map=input.chars().mapToObj(c->(char)c).
				collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
		
		// wrong List<String> ans=elist.stream().sorted(obj1->obj1.input()).
		//forEach(e).toString.count().collect(Collectors.toList());
	}
	
}