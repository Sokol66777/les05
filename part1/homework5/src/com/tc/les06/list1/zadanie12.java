package com.tc.les06.list1;

public class zadanie12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 5;
		double b = 4;
		double c = -4;
		if (a>0) {
			a = Math.pow(a,2);
		}
		else {
			a= Math.pow(a,4);
		}
		if (b>0) {
			b = Math.pow(b,2);
		}
		else {
			b= Math.pow(b,4);
		}
		if (c>0) {
			c = Math.pow(c,2);
		}
		else {
			c= Math.pow(c,4);
		}
		System.out.print("a=" + a + "\n" + "b=" + b + "\n"  + "c=" + c );

	}

}
