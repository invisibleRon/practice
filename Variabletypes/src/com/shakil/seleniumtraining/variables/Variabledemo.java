package com.shakil.seleniumtraining.variables;

public class Variabledemo {
	static int c = 200;
	int b =300; //instant variable
	
public void add() {
	int a =300; //local variable inside the method		
	System.out.println(a);
}
public void div() {
	int b =130;
 System.out.println(b);

}
public static void main(String[] args) {
	Variabledemo variableDemoObj=new Variabledemo();
			System.out.println(variableDemoObj.b);
	        System.out.println(Variabledemo.c); /*satic variable does 
	         not
	         need object to access the static variable*/

	        
}
}
