package com.tc.les06.list1;
import java.util.Scanner;
public class zadanie25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Input degree, if u want end programm write -1");
			a = sc.nextInt();
			if(a==-1) {
				return;
			}
			if (a<=60&&a>=0) {
				System.out.println("All ok");
			}
			else {
				System.out.println("Dunger");
			}
		}while (a!=-1);
	}
}				
				
			
		

	

