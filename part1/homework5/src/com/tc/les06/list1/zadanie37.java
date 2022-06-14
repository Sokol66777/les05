package com.tc.les06.list1;

public class zadanie37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 5;
		double ans;
		if (x<3) {
			ans=1/(Math.pow(x,3)-6);
		}
		else {
			ans = -Math.pow(x,2) + (3 * x) + 9;
		}
		System.out.println("ans=" + ans);

	}

}
