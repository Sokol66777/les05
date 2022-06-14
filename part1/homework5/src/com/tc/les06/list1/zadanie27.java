package com.tc.les06.list1;

public class zadanie27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		int b = 2;
		int c = 5;
		int d = 6;
		int min1;
		int min2;
		int max;
		if(a>b) {
			min1 = b;
		}
		else {
			min1=a;
		}
		if (c>d) {
			min2=d;
		}
		else {
			min2=c;
		}
		if(min1>min2) {
			max=min1;
		}
		else {
			max=min2;
		}
		System.out.println("max="+max);
	}

}
