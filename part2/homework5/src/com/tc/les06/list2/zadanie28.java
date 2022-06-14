package com.tc.les06.list2;

public class zadanie28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=1237;
		double deg; 
		double min;
		double sec;
		double temp;
		a = a*180/Math.PI;
		if(a>360) {
			temp=a/360;
			temp=(int)temp;
			a=a-temp*360;
		}
		temp=a;
		deg=(int)a;
		min=(temp-deg)*60;
		temp=(int)min;
		sec=(min-temp)*60;
		System.out.println("deg=" +deg);
		System.out.println("min=" +(int)min);
		System.out.println("sec=" +sec);

	}

}
