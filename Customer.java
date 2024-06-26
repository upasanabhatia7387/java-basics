package MethodReferenceExamples;

import java.util.List;

public class Customer {
	private Integer id;
	private String name;
	private String email;
	private List<String> moNumber;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(Integer id, String name, String email, List<String> mobileNo) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.moNumber = mobileNo;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getMoNumber() {
		return moNumber;
	}
	public void setMoNumber(List<String> mobileNo) {
		this.moNumber = mobileNo;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", mobileNo=" + moNumber + "]";
	}
	
	

}
