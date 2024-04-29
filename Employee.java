//go to PackageTest in com.inheritance for rest code.
package com.multipleinheritance;

public class Employee {
	private int id;
	private int age;
	private String name;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//protected concept with inheritance //go to PackageTest in com.inheritance for rest code.
	protected void printData() {
		System.out.println("data");
	}
	
	
}
