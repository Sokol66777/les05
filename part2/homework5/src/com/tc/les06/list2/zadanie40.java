package com.tc.les06.list2;

import java.util.Scanner;

public class zadanie40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		double y;
		double z1;
		double z2;
		Scanner sc = new Scanner (System.in);
		System.out.println("Input x");
		x=sc.nextDouble();
		y=x*x;
		z1=2*x+y*(3-4*x);
		z2=1+2*x+y*(3+4*x);
		System.out.println("z1="+ z1);
		System.out.println("z2="+ z2);
	}

}
