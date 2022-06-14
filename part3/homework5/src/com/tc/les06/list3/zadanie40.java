package com.tc.les06.list3;

public class zadanie40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=485;
		int len=0;
		int flag=0;
		double z1;
		for(int i=1;i<N+1;i++) {
			flag=0;
			len=0;
			for(int j=0;j<99;j++) {
				if((i/(int)Math.pow(10, j))>0) {
					len=len+1;
				}
			}		
			for(int j=len;j>0;j--) {
				z1=i%Math.pow(10, j);
				z1=(int)(z1/Math.pow(10, j)*10);
				if(i%z1==0) {
					flag=flag+1;
				}
				if(flag==len) {
					System.out.println(i);
				}
			}
		}
	}

}
