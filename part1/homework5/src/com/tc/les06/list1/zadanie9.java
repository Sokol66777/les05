package com.tc.les06.list1;

import java.util.Scanner;

public class zadanie9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		double c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input sides of triangle");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		if ((a==b)&& (b==c)) {
			System.out.println("Yes equilateral triangle");
			
		}
		else {
			System.out.println("no");
		}
	}

}
