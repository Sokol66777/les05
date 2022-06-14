package com.tc.les06.list3;

import java.util.Scanner;

public class zadanie25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		int x;
		int y=1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Input integer number");
		x=sc.nextInt();
		for(int i=1;i<x+1;i++) {
			y=y*i;
		}
		System.out.println(y);
	}

}
