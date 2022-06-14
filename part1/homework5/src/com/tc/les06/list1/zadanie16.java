package com.tc.les06.list1;

public class zadanie16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		int y = 0;
		if(x>0 && y>0) {
			System.out.println("Right and up");
		}
		else if(x>0 && y<0) {
			System.out.println("Right and down");
		}
		else if(x<0 && y<0) {
			System.out.println("Left and down");
		}
		else if(x<0 && y>0) {
			System.out.println("Left and up");
		}
		else if(x==0) {
			System.out.println("at OY");
		}
		else {
			System.out.println("at OX");
		}
			

	}

}
