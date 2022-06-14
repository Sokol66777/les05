package com.tc.les06.list1;

public class zadanie28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 8;
		int b = 4;
		int c = 4;
		int d = 2;
		int temp = 0;
		int max ;
		int min ;
		if (a==d) {
			System.out.println("d=a");
			temp++;
		}
		if (b==d) {
			System.out.println("b=a");
			temp++;
		}
		if (c==d) {
			System.out.println("c=a");
			temp++;
		}
		if (temp==0) {
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
			max= d-min;
			System.out.println("not found eqals numbers max=" + max);
		}
		
	}

}
