package java8example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDB {
	
	public static List<Customer> getAllCustomer(){
		return Stream
				.of(new Customer(101, "Allen", "allen@gmail.com", Arrays.asList("63762822","2628626862")),
						new Customer(102, "Black", "black@gmail.com", Arrays.asList("62757e6","816863")),
						new Customer(103, "upu", "upu@gmail.com", Arrays.asList("7638363","0282727")),
						new Customer(104, "doll", "doll@gmail.com", Arrays.asList("726262","8826826")))
				.collect(Collectors.toList());
										
						
		
	}
}
