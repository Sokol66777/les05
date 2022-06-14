package com.tc.les06.list2;

public class zadanie34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=5242880L;
		double Mb; 
		double Gb;
		double Tb;
		double temp;
		temp=a/1099511627776L;
		Tb=(int)temp;
		temp=a-Tb*1099511627776L;
		Gb=temp/1073741824L;
		Gb=(int)Gb;
		temp=a-Tb*1099511627776L-Gb*1073741824L;
		Mb=temp/1048576;
		System.out.println("Tb=" +Tb);
		System.out.println("Gb=" +Gb);
		System.out.println("Mb=" +Mb);
		System.out.println("temp=" +temp);

	}

}
