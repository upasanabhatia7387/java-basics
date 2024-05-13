package MethodReferenceExamples;

import java.util.List;

public class CustomerDTO {
	private Integer id;
	private String name;
	private String email;
	private List<String> moNumber;
	public CustomerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerDTO(Integer id, String name, String email, List<String> moNumber) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.moNumber = moNumber;
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
	public void setMoNumber(List<String> moNumber) {
		this.moNumber = moNumber;
	}
	@Override
	public String toString() {
		return "CustomerDTO [id=" + id + ", name=" + name + ", email=" + email + ", moNumber=" + moNumber + "]";
	}
	
	

}
