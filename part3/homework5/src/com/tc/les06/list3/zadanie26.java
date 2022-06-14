package com.tc.les06.list3;


public class zadanie26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index=0;
		int index2;
		int index3;
		char a;
		char b;
		char c;
		System.out.println("----------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "code", "symb");
		System.out.println("----------------------------------");
		for(int i =32;i<127;i++) {
			a=(char)i;
			System.out.printf("|\t%4d\t|\t%4c\t|\n", i,a);
			
		}
		System.out.println("-------------------------------------");
	}

}
