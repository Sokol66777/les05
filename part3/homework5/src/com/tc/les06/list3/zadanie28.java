package com.tc.les06.list3;

import java.util.Scanner;

public class zadanie28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		double x;
		double y;
		double z;
		
		int punkt;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("vyberite punkt");
			System.out.println("1-go");
			System.out.println("0-exit");
			punkt=sc.nextInt();
			switch(punkt) {
			case 1:
				System.out.println("Input x and y.");
				x=sc.nextInt();
				y=sc.nextInt();
				System.out.println("Input math symbol '+' '-' '*' or '/' ");
				a=sc.next();
				if (a.equals("-")){
				z=x-y;	
				System.out.println(z);
				}
				else if(a.equals("+")) {
					z=x+y;
					System.out.println(z);
				}
				else if(a.equals("*")) {
					z=x*y;
					System.out.println(z);
				}
				else if(a.equals("/")) {
					if(y==0) {
						System.out.println(" i can't x/0 ");
					}
					else { 
					z=x/y;
					System.out.println(z);
					}
				}
				else {
					System.out.println("i not find your symbol");
				}
				break;
			case 0:
				break;
			}
			
		}
		while(punkt!=0);
	}

}
