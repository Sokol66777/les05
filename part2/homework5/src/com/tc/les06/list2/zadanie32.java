package com.tc.les06.list2;

public class zadanie32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hours=1;
		int min=1;
		int sec=1;
		int hours1=48;
		int min1=1;
		int sec1=59;
		sec=sec+sec1;
		min=min+min1;
		hours=hours+hours1;
		while(sec>=60) {
			min=min+1;
			sec=sec-60;
		}
		while(min>=60){
			hours=hours+1;
			min=min-60;
		}
		while (hours>=24) {
			hours=hours-24;
		}
		System.out.println("after "+ hours1 + "h " + min1 +"m "+ sec1 + "s will be " + hours +"h "+min+"m "+sec+"s");
	}

}
