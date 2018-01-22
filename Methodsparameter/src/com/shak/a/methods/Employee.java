package com.shak.a.methods;

public class Employee {
	double salary;
	double bonus;
	double tax;
	double overtime;
	double SSB;
	double Medicare;
	
	public void calculateSalary(double salary,double bonus,double tax,double overtime,double SSB,double Medicare) {
		double totalPay = salary + bonus +tax+overtime+SSB+Medicare;
		System.out.println(totalPay);
	}

}
