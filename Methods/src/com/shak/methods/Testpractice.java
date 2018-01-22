package com.shak.methods;

public class Testpractice {

public static void main(String[] args) {
	Practice room1=new Practice();
	room1.length= 15;
	room1.width =5; 
	int area1 =room1.calculateArea();
	
	Practice room2=new Practice();
	room2.length= 10;
	room2.width =3; 
	int area2 =room2.calculateArea();
	System.out.println(area1+area2);
	//System.out.println(room1.calculateArea()+room2.calculateArea());
	
}	

	
}
