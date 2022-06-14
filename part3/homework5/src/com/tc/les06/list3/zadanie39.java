package com.tc.les06.list3;

public class zadanie39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		for (int i=10;i<100;i++) {
			x=i*7;
			if(x%100==i) {
				System.out.println(x);
				return;
			}
		}

	}

}
