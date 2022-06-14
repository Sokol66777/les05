package com.tc.les06.list1;
import java.util.Scanner;
public class zadanie34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter cost of book ");
		a = sc.nextInt();
		System.out.println("Enter cash");
		b = sc.nextInt();
		if(a==b) {
			System.out.println("ok");
		}
		else if (a>b) {
			System.out.println("GIVE ME YOUR MOOOOOONEY!!!! I TOOK ALL OF THEM. Need " + (a-b) );
		}
		else {
			System.out.println("your change " + (b-a));
		}
	}

}
