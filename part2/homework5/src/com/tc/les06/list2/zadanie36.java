package com.tc.les06.list2;

public class zadanie36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1055;
		int x= a / 1000;
		int y= (a / 100) % 10;
		int j = a % 10;
		int k = (a % 100 ) / 10;
		double chet=1;
		double nechet=1;
		double f;
		boolean q = false;
		if (x%2==0) {
			chet=chet*x;
		}
		else {
			nechet=nechet*x;
			 q = true;
		}
		if (y%2==0) {
			chet=chet*y;
		}
		else {
			nechet=nechet*y;
			q = true;
		}
		if (j%2==0) {
			chet=chet*j;
		}
		else {
			nechet=nechet*j;
			q = true;
		}
		if (k%2==0) {
			chet=chet*k;
		}
		else {
			nechet=nechet*k;
			q = true;
		}
		if(chet==1)
		{
			chet=0;
		}
		if (q==false) {
			nechet=0;
		}
		System.out.println("nechet=" +nechet + " chet=" +chet);
		f=chet/nechet;
		System.out.println("f=" +f);
	}

}
