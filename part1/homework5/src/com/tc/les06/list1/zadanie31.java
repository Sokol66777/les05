package com.tc.les06.list1;

public class zadanie31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 9;
		int x = 10;
		int y = 10;
		int z = 10;
		if((x<=a && z<=b) || (x<=b && z<=a)) {
			System.out.println("Ok");
		}
		else if((y<=a && z<=b)||(y<=b&&z<=a)) {
			System.out.println("Ok");
		}
		else if((x<=a && y<=b) || (x<=b && y<=a)) {
			System.out.println("Ok");
		}
		else {
			System.out.println("No");
		}
	}

}
