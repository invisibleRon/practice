package com.shakil.seleniumtraining.variables;

public class variableexample {
	

	public static void main(String[] args) {
	variabletest firstObj = new variabletest();	
	System.out.println(firstObj.b);
	variabletest secondObj = new variabletest();
	System.out.println(secondObj.b);
	firstObj.b = 200;
	System.out.println(firstObj.b);
	
	System.out.println(variabletest.a);
	}
	
	
}
