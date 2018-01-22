package com.shak.s.polymorphism;

public class Practice {
	int length =3;
	int width= 1;
	public void calculateArea() {
		int area = length*width;
		System.out.println(area);
	}
	public void calculateArea(int length, int width) {
		int area = length* width;
		System.out.println(area);

}
	public void calculateArea(int length) {
		int area = length*length;
		System.out.println(area);
	
}
	public void calculateArea(double length,double width) {
		double area = length*width;
		System.out.println(area);
}
}	
	
	