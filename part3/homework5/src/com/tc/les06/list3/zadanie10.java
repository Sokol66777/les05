package com.tc.les06.list3;

import java.math.BigInteger;

public class zadanie10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger x = new BigInteger( "1"); //Тут просто создается переменная "x" для использование класса BigInteger и присваивается значение "1". Присваивание обязательно должно быть в ковычках Со Scanner ты работаешь так же, как анология.
		for (int i = 1;i<201;i++)  { //ну тут понятно цикл
			x=x.multiply(BigInteger.valueOf( i * i)); // Что бы перемножить biginteger нужно использовать метод multiply. Метод "BigInteger.valueOf" возвращает объект BigInteger, значение которого равно числу, переданному в качестве параметра. Проще говоря я из int i сделал biginteger i. Это опять же нужно потому что biginteger можно умножить только на biginteger.
		}
		 System.out.println(x);
	}

}
