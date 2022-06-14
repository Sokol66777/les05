package com.tc.les06.list1;

public class zadanie39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 8;
		double ans;
		if (x<8) {
			ans=1/(Math.pow(x,4)-6);
		}
		else {
			ans = -Math.pow(x,2) + x - 9;
		}
		System.out.println("ans=" + ans);

	}

}
