package com.tc.les06.list3;
import java.util.Scanner;
public class zadanie32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		char a;
		int b;
		int flag=0;
		boolean x = false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input your string");
		s=sc.next();
		a=s.charAt(0);
		b=(int)a;
		if(b==95) {
			flag=1;
		}
		for(int i =65;i<91;i++) {
			if(b==i) {
				flag=1;
			}
		}
		for(int i =97;i<123;i++) {
			if(b==i) {
				flag=1;
			}
		}
		if(flag==1) {
			x= s.matches("[a-z A-Z _ 0-9]*");
		}
		System.out.println(x);
	}

}
