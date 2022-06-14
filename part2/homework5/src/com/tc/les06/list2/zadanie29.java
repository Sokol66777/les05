package com.tc.les06.list2;

public class zadanie29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=4;
		double b = 6;
		double c = 7;
		double cosa;
		double cosb;
		double cosc;
		cosa=(a*a+c*c-b*b)/(2*a*c);
		cosb=(a*a+b*b-c*c)/(2*a*b);
		cosc=(b*b+c*c-a*a)/(2*b*c);
		cosa=Math.acos(cosa);
		cosb=Math.acos(cosb);
		cosc=Math.acos(cosc);
		System.out.println("In rad aplha=" + cosa);
		System.out.println("In rad beta=" + cosb);
		System.out.println("In rad gamma=" + cosc);
				
		
	}

}
