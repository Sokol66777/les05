package com.tc.les06.list2;
import java.util.Scanner;
public class zadanie39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		double y;
		double z;
		Scanner sc = new Scanner (System.in);
		System.out.println("Input x");
		x=sc.nextDouble();
		y=x*x;
		z=y*(2*y-3*x)+4*y-5*x+6;
		System.out.println("z="+ z);
	}

}
