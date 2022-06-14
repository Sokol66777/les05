package com.tc.les06.list1;

public class zadanie15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x=9;
		double y=8;
		double a;
		double b;
		a = (x + y)/2;
		b = 2*x*y;
		if (x>y) {
			x=b;
			y=a;
		}
		else {
			x=a;
			y=b;
		}
		System.out.print("x=" + x + "\n" + "y=" + y);
	}

}
