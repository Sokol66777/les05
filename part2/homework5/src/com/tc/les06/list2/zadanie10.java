package com.tc.les06.list2;

public class zadanie10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x=30;
		double y= 60;
		double ans;
		x= x *Math.PI/180;
		y= y *Math.PI/180;
		ans= (Math.sin(x) + Math.cos(y)) / (Math.cos(x)-Math.sin(y)) * Math.tan(x*y);
		System.out.println("ans=" + ans );
	}

}
