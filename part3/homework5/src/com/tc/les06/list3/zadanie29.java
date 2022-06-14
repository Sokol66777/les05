package com.tc.les06.list3;

import java.util.Scanner;

public class zadanie29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x =1534.238;
		double y=34265.3465;
		int a;
		int b;
		int len1=1;
		int len2=1;
		double z1;
		double z2;
		String[] split1 =  String.valueOf(x).split("\\.");
		String[] split2 = String.valueOf(y).split("\\.");
		a=split1[1].length();
		b=split2[1].length();
		x=x*Math.pow(10, a);
		y=y*Math.pow(10, b);
		a=(int)x;
		b=(int)y;
		for(int i=1;i<99;i++) {
			if((a/(int)Math.pow(10, i))>0) {
				len1=len1+1;
			}
		}
		
		for(int i=1;i<99;i++) {
			if((b/(int)Math.pow(10, i))>0) {
				len2=len2+1;
			}
		}
		System.out.println("Symbols of first number");
		for(int i=len1;i>0;i--) {
			z1=a%Math.pow(10, i);
			z1=(int)(z1/Math.pow(10, i)*10);
			System.out.println((int)z1);
			}	
		System.out.println("Symbols of second number");
		for(int i=len2;i>0;i--) {
			z2=b%Math.pow(10, i);
			z2=(int)(z2/Math.pow(10, i)*10);
			System.out.println((int)z2);
			}	
		}

}
