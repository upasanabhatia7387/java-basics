package MethodReferenceExamples;

public class CustomerMapper {
	
	public static CustomerDTO convert(Customer customer) {
		CustomerDTO dto = new CustomerDTO();
		dto.setId(customer.getId());
		dto.setName(customer.getName());
		dto.setEmail(customer.getEmail());
		dto.setMoNumber(customer.getMoNumber());
		return dto;
		
	}
	
	public CustomerDTO convert1(Customer customer) {
		CustomerDTO dto = new CustomerDTO();
		dto.setId(customer.getId());
		dto.setName(customer.getName());
		dto.setEmail(customer.getEmail());
		dto.setMoNumber(customer.getMoNumber());
		return dto;
		
	}

}
