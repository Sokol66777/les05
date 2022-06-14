package com.tc.les06.list1;
import java.util.Scanner;
public class zadanie23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data;
		int month;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please input data from 1 to 31 and month from 1 to 12");
		while(!sc.hasNextInt()) {
			System.out.println("You input uncorrect day");
			return;
		}
		data=sc.nextInt();
		while(!sc.hasNextInt()){
			System.out.println("You input uncorrect month");
			return;
		}
		month=sc.nextInt();
		if((data<=31&&data>=1)&& (month<=12&&month>=1)) {
			System.out.println("All true");
		}
		else {
		System.out.println("You input uncorrect data");
		}
	}

}
