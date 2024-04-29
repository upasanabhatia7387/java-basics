package com.inheritance;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContractEmployee ce = new ContractEmployee();
		ce.setId(100);
		ce.setName("hee");
		ce.setStipend(200);
		System.out.println(ce.getId()+","+ ce.getName()+","+ce.getStipend());
		

		RegularEmployee re = new RegularEmployee();
		re.setId(100);
		re.setName("hee");
		re.setSalary(1788);
		System.out.println(re.getId()+","+ re.getName()+","+re.getSalary());
		
	}

}
