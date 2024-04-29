package com.demo.Poly;

class Animal{
	void eat() {
		System.out.println("Animal eats");
	}
}

class Cat extends Animal{
	void eat() {
		System.out.println("Cat Eats");
	}
	
}

public class PolyTest1 {
	
	public static void main(String args[]) {
		Animal animal = new Cat();
		animal.eat();
	}
}
