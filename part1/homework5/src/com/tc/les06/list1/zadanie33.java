package com.tc.les06.list1;
import java.util.Scanner;
public class zadanie33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pass;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your password");
		pass=sc.nextInt();
		if(pass==9583 || pass== 1747) {
			System.out.println("Access modules A B C ");
		}
		else if(pass==3331 || pass== 7922) {
			System.out.println("Access modules B C ");
		}
		else if(pass==9455 || pass== 8997) {
			System.out.println("Access modules  C ");
		}
		else {
			System.out.println("Wrong password");
		}
	}

}
