package com.tc.les06.list1;

public class zadanie14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=45;
		int b = 45;
		int c;
		int sum;
		sum=a+b;
		if(sum>=180)
		{
			System.out.println("This triangle can not be");
		}
		else if(sum==90) {
			System.out.println("This triangle have right angle");
		}
		else {
			System.out.println("Usual triangle");
		}
	}

}
