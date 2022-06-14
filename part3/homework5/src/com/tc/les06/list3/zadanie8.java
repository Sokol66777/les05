package com.tc.les06.list3;

public class zadanie8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=6;
		int b=16;
		int h=1;
		int c=2;
		int y;
		for(int i=a;i<b+h;i=i+h) {
			if(i==15.0) {
				y=(i+c)*2;
				System.out.println(y);
			}
			else {
				y=(i-c)+6;
				System.out.println(y);
			}
		}
		


	}

}
