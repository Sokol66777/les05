package com.tc.les06.list3;
import java.util.Random;
import java.util.Scanner;
public class zadanie31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arrayran = new int [5];
		int [] arrayinp = new int [5];
		int [] arraytrue = new int[5];
		int a=0;
		int flag;
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<5;i++) {
		arrayran[i]=1+(int)(Math.random()*15);
		}
		System.out.println("array random");
		for (int i=0;i<5;i++) {
			System.out.print(" "+ arrayran[i]);
		}
		System.out.println("\n");
		System.out.println("Input 5 numbers from 1 to 15");
		for(int i=0;i<5;i++) {
			arrayinp[i]=sc.nextInt();
		}
		System.out.println("Your array");
		for (int i=0;i<5;i++) {
			System.out.print(" "+ arrayinp[i]);
		}
		System.out.println("\n");
		for (int i=0; i<5; i++) {
			flag=0;
			for(int j=0;j<5;j++) {
				if (arrayinp[i]==arrayran[j]) {
					arraytrue[a]=arrayinp[i];
					a+=1;
					arrayinp[i]=0;
					arrayran[j]=-1;
				}
			}
		}
		System.out.println("true array");
		for(int i=0; i<a; i++) {
			System.out.print(" "+ arraytrue[i]);
		}
		System.out.println("\n");
		System.out.println("input wrong");
		for(int i=0; i<5; i++)
			if(arrayinp[i]>0) {
				System.out.print(" "+ arrayinp[i]);
			}
		System.out.println("\n");
		System.out.println("you not find tis numbers");
		for(int i=0;i<5;i++) {
			if(arrayran[i]>0) {
				System.out.print(" "+ arrayran[i]);
			}
		}
	}

}
