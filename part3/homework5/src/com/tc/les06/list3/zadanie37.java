package com.tc.les06.list3;

public class zadanie37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A;
		int B;
		int x;
		int y;
		for(int i=11; i<102;i++) {
			x=99*i;
			B=x%100;
			A=(x-B)/100;
			y=B*100+A;
			if(y%49==0) {
				System.out.println("A="+A+", B="+B);
			}
		}
	}

}
