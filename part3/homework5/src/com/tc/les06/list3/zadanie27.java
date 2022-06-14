package com.tc.les06.list3;
import java.util.Scanner;
public class zadanie27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input m and n");
		m=sc.nextInt();
		n=sc.nextInt();
		for( m=m;m<n+1;m++) {
			for(int i=2;i<m;i++) {
				if(m%i==0) {
					System.out.println(m+"-"+i);
				}
			}
				
		}
	}

}
