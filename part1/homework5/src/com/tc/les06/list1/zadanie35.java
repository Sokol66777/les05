package com.tc.les06.list1;
import java.util.Scanner;
public class zadanie35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int month =0;
		int day;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		int array[] = new int [12];
		array[0]=31;
		array[1]=28;
		array[2]=31;
		array[3]=30;
		array[4]=31;
		array[5]=30;
		array[6]=31;
		array[7]=31;
		array[8]=30;
		array[9]=31;
		array[10]=30;
		array[11]=31;
		System.out.println("Input day ");
		a = sc.nextInt();
		if (a>365) {
			System.out.println("wrong day ");
			return;
		}
		for (int i=0; i<12; i++  ) {
			sum = sum + array[i];
			month = i;
			if (sum>=a) {
				sum=sum-array[i];
				break;
			}
		}
		day = a-sum;
		month = month +1;
		System.out.println("month= " + month);
		System.out.println("day=" + day);
		
	}

}
