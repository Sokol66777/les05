package com.tc.les06.list1;

public class zadanie11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a1=10;
		double b1=8;
		double c1=5;
		double a2=5;
		double b2=4;
		double c2=7;
		double p1;
		double p2;
		double s1;
		double s2;
		p1=(a1+b1+c1)/2;
		p2=(a2+b2+c2)/2;
		s1=Math.sqrt(p1*(p1-a1)*(p1-b1)*(p1-c1));
		s2=Math.sqrt(p2*(p2-a2)*(p2-b2)*(p2-c2));
		if(s1>s2) {
			System.out.println("S1 more s1=" + s1);
		}
		else
		{
			System.out.println("S2 more s2=" + s2);
		}

	}

}
