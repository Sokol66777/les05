package com.tc.les06.list3;
import java.util.Scanner;
public class zadanie6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int a=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("input positive integer number");
		x=sc.nextInt();
		for (int i=1;i<x+1;i++)
		{
			a=a+i;
		}
		System.out.println(a);
	}

}
