package com.tc.les06.list1;

public class zadanie17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 17;
		int n = 199;
		if (m==n) {
			m=0;
			n=0;
		}
		else if (m>n){
			n=m;		
		}
		else {
			m=n;
		}
		System.out.println("m=" + m + " n=" + n);

	}

}
