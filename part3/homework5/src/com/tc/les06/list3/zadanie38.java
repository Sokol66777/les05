package com.tc.les06.list3;

import java.util.Scanner;

public class zadanie38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len=1;
		int x;
		double z;
		double z2;
		double a;
		double b;
		double c;
		int flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input integer number");
		x=sc.nextInt();
		if(x<100) {
			return;
		}
		for(int i=1;i<99;i++) {
			if((x/(int)Math.pow(10, i))>0) {
				len=len+1;
			}
		}
		a=x%Math.pow(10, 1);
		a=(int)(a/Math.pow(10, 1)*10);
		b=x%Math.pow(10, 1+1);
		b=(int)(b/Math.pow(10, 1+1)*10);
		c=a-b;
		for(int i=1;i<len+1;i++) {
			z=x%Math.pow(10, i);
			z=(int)(z/Math.pow(10, i)*10);
			z2=x%Math.pow(10, i+1);
			z2=(int)(z2/Math.pow(10, i+1)*10);
			if((i+1!=len+1)&&(z-z2==c))
			{
				flag+=1;
			}	
			}
		if(flag==len-1) {
			System.out.println("Yes");
		}
		else {
			System.out.println("nope");
		}
	}

}
