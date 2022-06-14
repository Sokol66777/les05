package com.tc.les06.list2;

public class zadanie13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1=4, y1 = 2;
		double x2 = -6, y2 = 2;
		double x3 = 3, y3 = 5;
		double d1;
		double d2;
		double d3;
		double p;
		double s;
		double halfp;
		d1 = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
		d2 = Math.sqrt(Math.pow(x1-x3, 2) + Math.pow(y1-y3, 2));
		d3 = Math.sqrt(Math.pow(x2-x3, 2) + Math.pow(y2-y3, 2));
		p=d1+d2+d3;
		halfp=p/2;
		s=Math.sqrt(halfp*(halfp-d1)*(halfp-d2)*(halfp-d3));
		System.out.println("p=" + p);
		System.out.println("s=" + s);

	}

}
