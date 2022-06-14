package com.tc.les06.list1;

public class zadanie30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 9;
		int c = -3;
		if(a>b&&b>c) {
			a=a*2;
			b=b*2;
			c=c*2;
			System.out.print("a=" + a + "\n" + "b=" + b + "\n" + "c="+c );
		}
		else {
			System.out.print("a=" + Math.abs(a) + "\n" + "b=" + Math.abs(b) + "\n" + "c="+Math.abs(c) );
		}
	}

}
