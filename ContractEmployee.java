package com.inheritance;

public class ContractEmployee extends Employee {
	private int stipend;

	public ContractEmployee() {
		super();
		
	}

	public ContractEmployee(int stipend) {
		super();
		this.stipend = stipend;
	}

	public int getStipend() {
		return stipend;
	}

	public void setStipend(int stipend) {
		this.stipend = stipend;
	}
	
	
}
