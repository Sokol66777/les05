package com.tc.les06.list3;

public class zadanie33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=76576;
		int len1=1;
		int max=0;
		double z1;
		for(int i=1;i<99;i++) {
			if((a/(int)Math.pow(10, i))>0) {
				len1=len1+1;
			}
		}
		for(int i=len1;i>0;i--) {
			z1=a%Math.pow(10, i);
			z1=(int)(z1/Math.pow(10, i)*10);
			if(z1>max) {
				max=(int)z1;
			}
		}
		System.out.println("max="+max);
	}
}


