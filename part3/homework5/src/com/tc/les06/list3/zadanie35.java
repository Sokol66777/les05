package com.tc.les06.list3;

import java.util.Scanner;

public class zadanie35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len=1;
		int sum=0;
		int x;
		double y=0;
		double z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input integer number");
		x=sc.nextInt();
		for(int i=1;i<99;i++) {
			if((x/(int)Math.pow(10, i))>0) {
				len=len+1;
			}
		}
		for(int i=1;i<len+1;i++) {
			z=x%Math.pow(10, i);
			z=(int)(z/Math.pow(10, i)*10);
			if(z%2==0)
			{
				sum+=1;
			}	
			}	
		System.out.println("kol-vo chetnih chisel="+sum);
	}

}
