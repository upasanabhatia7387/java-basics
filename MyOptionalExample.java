package OptionalExample;

import java.util.Optional;

public class MyOptionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3 ways to create object of optional method
		//1. way
		Optional<String> op =Optional.of("Allen");
		
		//2. way
		Optional empty = Optional.empty();
		
		//3. Way
		Optional<String> value = Optional.ofNullable("Black");
		
		System.out.println(op+","+empty+","+value);
		
		
		Optional<String> value1 = Optional.ofNullable("Allen");
		String  name=value1.filter(x->x.equals("Black")).orElse("Name is not matching or name is not null");
		System.out.println(name);
		
		
		Optional<String> value2 = Optional.ofNullable(null);
		String name1 = value2.map(String::toUpperCase).orElse("Value is null");
		
		if(value2.isPresent()) {
			System.out.println(value2);
		}
		else {
			System.out.println("Name not found");
		}
		
		Optional<String> gender = Optional.ofNullable("MALE");
		System.out.println(gender.orElseGet(()->"</NA>"));
		
		//get method
		Optional<String> value3 = Optional.ofNullable("Allen");
		Optional<String> value4 = Optional.ofNullable("Allen");
		
		System.out.println(value3.get());
	}
	
	

}
