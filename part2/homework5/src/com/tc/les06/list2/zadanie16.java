package com.tc.les06.list2;

public class zadanie16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5155;
		int x= a / 1000;
		int y= (a / 100) % 10;
		int j = a % 10;
		int k = (a % 100 ) / 10;
		int b = x* y *j*k;
			System.out.println("b=" +b);

	}

}