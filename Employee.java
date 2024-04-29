package com.demo;

//POJO, Model, Entity Class
public class Employee{
	int id;
	String name;
	int mobile;
//	static int totalEmployee;
	
	//setters and getters
	public Employee(){ //non parameterize constructor
		
	}
	
	
	public Employee(int id, String name, int mobile){ // parameterize constructor
		this.id=id;
		this.name=name;
		this.mobile=mobile;
		}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	
	public int getMobile() {
		return mobile;
	}
	
//	
//	public int gettotalEmployee() {
//		return totalEmployee++;
//	}
}


