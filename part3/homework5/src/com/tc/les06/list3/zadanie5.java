package com.tc.les06.list3;

public class zadanie5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int x=0;
		while (i<100) {
			if(i%2==1) {
				x=x+i;
			}
			i=i+1;
		}
		System.out.println(x);
	}

}
