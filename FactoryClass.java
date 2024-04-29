package com.designPattern.FactoryDesign;

public class FactoryClass {
	public Employee getEmployee(String employee) {
		if (employee == null) {
			return null;
		} else if (employee.equalsIgnoreCase("Software")) {
			return new SoftwareEmployee();
		}
		else if (employee.equalsIgnoreCase("Permanent")) {
			return new Permanent();
		}
		else if (employee.equalsIgnoreCase("Contract")) {
			return new Contract();
		}
		else {
			return null;
		}
	}
	
}
