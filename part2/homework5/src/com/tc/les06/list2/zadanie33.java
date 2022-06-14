package com.tc.les06.list2;
import java.util.Scanner;

public class zadanie33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index1;
		int index2;
		int index3;
		char a;
		char b;
		char c;
		Scanner sc=new Scanner(System.in);
		a = sc.next().charAt (0);
		index1 = (int)a;
		index2=index1-1;
		b=(char)index2;
		index3=index1+1;
		c=(char)index3;
		System.out.println(index1 + " " + b + " " + c);
	}

}
