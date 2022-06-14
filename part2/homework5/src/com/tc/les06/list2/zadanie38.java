package com.tc.les06.list2;

import java.util.Scanner;

public class zadanie38 {
	private static void printmenu() {
		System.out.println("menu");
		System.out.println("1: oblast 1");
		System.out.println("2: oblast 2");
		System.out.println("3: oblast 3");
		System.out.println("4: exit");
	}
	private static void case1(double x, double y){
		double a;
		double b;
		double c;
		a=(4-x)*(4-0)-(0-4)*(0-y);
		b=(0-x)*(0-4)-(-4-0)*(4-y);
		c=(-4-x)*(0-0)-(4-(-4))*(0-y);
		if(((a>=0) && (b>=0) && (c>=0)) || ((a<=0) && (b<=0) && (c<=0))){
			System.out.println("True");
		}
		else {
			System.out.println("false");
		}
	}
	private static void case2(double x, double y) {
		if (((-2<=x)&&(x<=2)) && ((0<=y)&&(y<=4))) {
			System.out.println("True");
		}
		else if (((-4<=x)&&(x<=4)) && ((-3<=y)&&(y<=0))) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
	private static void case3(double x, double y) {
		double length;
		if(x>=0&&y>=0) {
			length=Math.sqrt(Math.pow(x,2)+ Math.pow(y, 2));
			if (length<4) {
				System.out.println("True");
			}
			else {
				System.out.println("False");
			}
		
		}
		else if(x>=0&&y<=0) {
			length=Math.sqrt(Math.pow(x,2)+ Math.pow(y, 2));
			if (length<5) {
				System.out.println("True");
			}
			else {
				System.out.println("False");
			}
		}
		else {
			System.out.println("False");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x, y;
		int punkt;
		Scanner sc = new Scanner(System.in);
		do {
			printmenu();
			System.out.println("Vibereti punkt");
			punkt=sc.nextInt();
			switch(punkt) {
			case 1: 
				System.out.println("vvedite Vvedite tochku s kooprinatami (x,y)");
				x = sc.nextInt();
				y = sc.nextInt();
				case1(x,y);
				break;
			case 2:
				System.out.println("vvedite Vvedite tochku s kooprinatami (x,y)");
				x = sc.nextInt();
				y = sc.nextInt();
				case2(x,y);
				break;
			case 3:
				System.out.println("vvedite Vvedite tochku s kooprinatami (x,y)");
				x = sc.nextInt();
				y = sc.nextInt();
				case3(x,y);
				break;
			case 4:
				break;
			default:
				System.out.println("Net takogo punkta");
				break;
			}
		}while(punkt!=4);
		
		

	}

}
