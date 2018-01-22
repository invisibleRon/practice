package com.shak.a.methods;

public class Testemployee {

	public static void main(String[] args) {
		Employee John = new Employee();
		John.salary = 500;
		John.bonus = 200;
		John.tax = 50;
		John.overtime = 30;
		John.SSB = 25;
		John.Medicare = 90;
		John.calculateSalary(500,200,50,30,25,90); /*methods with passing 
		parameters
		benefits : shows all the required parameters to achieve
		actual result*/
		

	}
}
