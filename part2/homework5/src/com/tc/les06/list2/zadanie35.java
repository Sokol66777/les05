package com.tc.les06.list2;

import java.util.Scanner;

public class zadanie35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double M=401;
		double N=4;
		double a;
		double x1;
		double x2;
		a=M/N;
		x1=a%10;
		x1=(int)x1;
		x2=a*10%10;
		x2=(int)x2;
		System.out.println(x1); 
		System.out.println(x2);
	}

}
