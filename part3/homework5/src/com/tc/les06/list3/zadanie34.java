package com.tc.les06.list3;

public class zadanie34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		int d;
		int x;
		for (int i=1000;i<10000;i++) {
			a=i / 1000;
			b= (i / 100) % 10;
			c = i % 10;
			d = (i % 100 ) / 10;
			if(a+b+c+d==15) {
				System.out.println(i);
			}
		}
	}

}
