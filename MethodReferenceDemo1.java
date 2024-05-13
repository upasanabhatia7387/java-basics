package MethodReferenceExamples;

public class MethodReferenceDemo1 {

	public static void main(String[] args) {
		//lambda expression
		CustomerDB.getAllCustomer().stream().forEach(customer->System.out.println(customer));
		
		//method reference
		CustomerDB.getAllCustomer().stream().forEach(System.out::println);
		
		//ANother method
		MethodReferenceDemo1 mf = new MethodReferenceDemo1();
		CustomerDB.getAllCustomer().stream().forEach(mf::display);
		
		//lambda expression
		CustomerDB.getAllCustomer().stream().map(customer -> CustomerMapper.convert(customer)).
		forEach(System.out::println);
		
		//method reference with static method i.e calling by class name
		CustomerDB.getAllCustomer().stream().map(CustomerMapper::convert).forEach(System.out::println);
		
		//method reference with non-static method i.e calling after creating a ref variable
		CustomerMapper cm  = new CustomerMapper();
		CustomerDB.getAllCustomer().stream().map(cm::convert1).forEach(System.out::println);
		
		//we can call non parameterise non static method by the class name using method reference
		CustomerDB.getAllCustomer().stream().map(Customer::getName).forEach(System.out::println);
		
		//parameterise non static method can be called by reference name only else will give cte error
		//CustomerDB.getAllCustomer().stream().map(Customer::gsetName).forEach(System.out::println);
	}
	
	public void display(Customer customer) {
		System.out.println(customer);
	}

}
