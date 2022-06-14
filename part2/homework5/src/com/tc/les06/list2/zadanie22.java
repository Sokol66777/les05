package com.tc.les06.list2;

public class zadanie22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t=5345739;
		int hour;
		int min;
		int sec;
		hour=t/3600;
		t=t-hour*3600;
		min=t/60;
		sec=t-min*60;
		System.out.println(hour + "h " + min + "m " + sec + "sec" );
	}

}
