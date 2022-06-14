package com.tc.les06.list3;

public class zadanie30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "MCDXL";
		int fullvalue=0;
		int value1;
		int value2;
		char symb1;
		char symb2;
		for (int i=0;i<x.length(); i++) {
			symb1=x.charAt(i);
			value1 = rtod(symb1);
			if (i+1<x.length()) {
				symb2=x.charAt(i+1);
				value2 = rtod(symb2);
				if(value1<value2) {
					fullvalue=fullvalue-value1;
				}
				else {
				fullvalue+=value1;
				}
			}
			else {
				fullvalue+=value1;
			}
		}
		System.out.println(fullvalue);
	}
	private static int rtod(char a) {
		switch (a) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}
}
