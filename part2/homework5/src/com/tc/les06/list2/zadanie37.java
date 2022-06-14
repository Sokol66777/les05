package com.tc.les06.list2;

import java.util.Scanner;


public class zadanie37 {
	public static void printmenu() {
		System.out.println("menu");
		System.out.println("1: Celoe chislo N chet i dwooznachnoe");
		System.out.println("2: Summa 2ux pervix cifr zadannogo chetirexznachnogo chisla ravna summe poslednix dwooh");
		System.out.println("3: Summa cifr zadannogo 3-eh znachnogo chisla - chet");
		System.out.println("4: Tochka O(x,y) prinadlejit ploskosti lejachei mejdu pramimi x=m x=n (n<m)");
		System.out.println("5: qadrat zadannogo 3-eh znachnogo chisla = raven kubu summi cifr etogo chisla");
		System.out.println("6: Treugolnic so storonami a,b,c-ravnobedrenni");
		System.out.println("7: Summa kakih libo 2-uh cifr zadannogo 3-eh znachnogo chisla ravna poslednemu chislu");
		System.out.println("8: chislo N eto pokazatel stepeni chisla a (stepen ot 0 do 4)");
		System.out.println("9: y=ax^2 + bx + c prohodit cherez zadannooy tochku s koordinatami (m,n)");
		System.out.println("10: exit" + "\n\n\n");
	}
	private static void case1(int N) {
		
		if (N>9&&N<100) {
			if (N%2==0) {
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
	private static void case2(int N) {
		int a;
		int b;
		int c;
		int d;
		int x;
		int y;
		a = N / 1000;
		b = (N / 100) % 10;
		c = N % 10;
		d = (N % 100 ) / 10;
		x = a+ b;
		y= c+d;
		if (x==y)
			System.out.println ("True");
		else 
			System.out.println("False");
	}
	private static void case3(int N) {
		 int a= N / 100;
		 int b= (N / 10) % 10;
		 int n = N % 10;
		 int m=a+b+n;
		 if(n%2==0) {
			 System.out.println("True");
		 }
		 else {
			 System.out.println("False");
		 }
		
	}
	private static void case4(int m,int n,int x) {
		if (x>m&&x<n)
		{
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
	}
	private static void case5(int N) {
		int sqare;
		int a;
		int b;
		int c;
		int x;
		
		sqare=N*N;
		a= N / 100;
		b= (N / 10) % 10;
		c = N % 10;
		x=a+b+c;
		x=(int)Math.pow(x, 3);
		if (sqare==x)
		{
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
	private static void case6(int a, int b, int c) {
		if (a==b||b==c||c==a) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
	}
	private static void case7(int N) {
		int a;
		int b;
		int c;
		int x;
		a= N / 100;
		b= (N / 10) % 10;
		c = N % 10;
		x=c;
		if((a+b==x)||(a+c==x)||(b+c==x)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
	
	public static void case9 (double x, double y, double a, double b, double c) {
		double z;
		z= (a*x*x)+(b*x)+c;
		System.out.println(y);
		System.out.println(z);
		if (z==y) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int punkt;
		int N;
		int a;
		int b;
		int c;
		int m;
		int n;
		int x;
		int y;
		Scanner sc = new Scanner(System.in);
		do {
			printmenu();
			System.out.println("Vibereti punkt");
			punkt=sc.nextInt();
			switch(punkt) {
			case 1: 
				System.out.println("vvedite N");
				N = sc.nextInt();
				case1(N);
				break;
			case 2:
				System.out.println("vvedite N");
				N = sc.nextInt();
				case2(N);
				break;
			case 3:
				System.out.println("vvedite N");
				N = sc.nextInt();
			    case3(N);
				break;
			case 4:
				System.out.println("vvadine 'm' i 'n' (m<n)");
				m = sc.nextInt();
				n = sc.nextInt();
				System.out.println("vvadine tochku O(x,y)");
				x = sc.nextInt();
				y = sc.nextInt();
				case4(m,n,x);
				break;
			case 5:
				System.out.println("vvedite N");
				N = sc.nextInt();
				case5(N);
				break;
			case 6:
				System.out.println("vvedite storoni treugolnika a b c");
				a = sc.nextInt();
				b = sc.nextInt();
				c = sc.nextInt();
				case6(a,b,c);
				break;
			case 7:
				System.out.println("vvedite N");
				N = sc.nextInt();
				case7(N);
				break;
			case 8: //Так и не понял задачу из этого пункта
				break;
			case 9:
				System.out.println("vvadine 'm' i 'n' ");
				m = sc.nextInt();
				n = sc.nextInt();
				System.out.println("vvadine a,b,c ");
				a = sc.nextInt();
				b = sc.nextInt();
				c = sc.nextInt();
				case9(m,n,a,b,c);
				break;
			case 10:
				break;
			default:
				System.out.println("Net takogo punkta");
				break;
			}
		}while(punkt!=10);
		
		

	}

}
