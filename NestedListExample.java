package java8example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NestedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer> customers = CustomerDB.getAllCustomer();
		
		//find customer mobile no.
		List<List<String>> mobilenumbers = customers.stream().map(c->c.getMobileNo()).collect(Collectors.toList());
		
		System.out.println(mobilenumbers);
		
		//flatmap
		List<String> mNumbers = customers.stream().flatMap(customer->customer.getMobileNo().stream()).
				collect(Collectors.toList());
		
		System.out.println(mNumbers);
		
		//Find the second largest numbers using stream api
		List<Integer> numbers = Arrays.asList(1,2,3,5,6,6,7);
		
		//1.sort it
		//2. array[secondlast number]
		
		int secondLargest = numbers.stream().distinct()
                .sorted((a, b) -> b.compareTo(a)) // Sort in descending order
                .skip(1) // Skip the first element
                .findFirst()
                .orElse(null);// Find the first element after skipping
                
        System.out.println("Second largest number: " + secondLargest);
        
        //find string which appearing more than one time in stream api
        List<String> lists = Arrays.asList("apple", "banana", "apple", "apple", "banana");
        
//        Map<Object, Long> occurrences = lists.stream()
//                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
//
//        List<Object> duplicates = occurrences.entrySet().stream()
//                .filter(entry -> entry.getValue() > 1)
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toList());
        List <String> result = lists.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
        		.entrySet().stream().filter(e->e.getValue()>1).map(e1->e1.getKey()).collect(Collectors.toList());

        System.out.println("Strings appearing more than once: " + result);
		
	}

}
