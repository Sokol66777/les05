package com.tc.les06.list3;

public class zadanie7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=-2;
		double b=6;
		double h=0.2;
		double x;
		for(double i=a;i<b+h;i=i+h) {
			if(i<=2) {
				x=i*(-1);
				System.out.println(x);
			}
			else {
				x=i;
				System.out.println(x);
			}
		}
		

	}

}
