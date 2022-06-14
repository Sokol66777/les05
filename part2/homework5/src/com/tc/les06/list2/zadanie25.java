package com.tc.les06.list2;

public class zadanie25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=1;
		double b=4;
		double c = -7;
		double D;
		double x1, x2;
		D=(b*b)-(4*a*c);
		if (D<0){
			System.out.println("sqare is not found");
		}
		else {
			x1=(-b + Math.sqrt(D))/(2*a);
			x2=(-b - Math.sqrt(D))/(2*a);
			System.out.println("x1="+x1+" x2="+x2);
		}
	}

}
