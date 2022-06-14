package com.tc.les06.list3;

import java.util.Scanner;

public class zadanie20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double n;
		double m;
		double e;
		double x=0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Input from 'm' to 'n' and 'e'");
		m=sc.nextDouble();
		n=sc.nextDouble();
		e=sc.nextDouble();
		for(m=m;m<n;m++) {
			a=1/((3*n-2)*(3*n+1));
			if(Math.abs(a)>=e) {
				x=x+a;
			}
		}
		System.out.println(x);
	}

}
