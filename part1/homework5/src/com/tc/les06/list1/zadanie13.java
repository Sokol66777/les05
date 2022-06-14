package com.tc.les06.list1;

public class zadanie13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1=10;
		double y1=8;
		double x2=5;
		double y2=5;
		double p1;
		double p2;
		double length1;
		double length2;
		length1=Math.sqrt(Math.pow(x1,2)+ Math.pow(y1, 2));
		length2=Math.sqrt(Math.pow(x2,2)+ Math.pow(y2, 2));
		if(length1<length2) {
			System.out.println("Length1 less=" + length1);
		}
		else {
			System.out.println("Length2 less=" + length2);
		}
		
	}

} 
