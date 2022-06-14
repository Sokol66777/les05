package com.tc.les06.list3;

public class zadanie36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A;
		int B;
		int x;
		int y;
		for(int i=1000; i<10000;i++) {
			B=i%100;
			A=(i-B)/100;
			x=A*B;
			if(x!=0) {
				if(i%x==0) {
					System.out.println(i);
				}
			}
		}
	}

}
