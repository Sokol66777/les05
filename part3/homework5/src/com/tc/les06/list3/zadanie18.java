package com.tc.les06.list3;
import java.util.Scanner;
public class zadanie18 {

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
			a=Math.pow(-1, m)/m;
			if(Math.abs(a)>=e) {
				x=x+a;
			}
		}
		System.out.println(x);
	}

}
