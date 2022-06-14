package com.tc.les06.list1;

public class zadanie26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		int b=5;
		int c=7;
		int max;
		int min;
		int sum;
		if (a>=b&&a>=c) {
			max=a;
		}
		else if(b>=a&&b>=c) {
			max=b;
		}
		else {
			max=c;
		}
		if(a<=b&&a<=c) {
			min=a;
		}
		else if(b<=a&&b<=c)
		{
			min=b;
		}
		else {
			min=c;
		}
		sum=max+min;
		System.out.println("Sum of greatest and least=" + sum);
		

	}

}
