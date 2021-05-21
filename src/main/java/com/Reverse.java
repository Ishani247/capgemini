package com;

public class Reverse {

	public static void main(String[] args) {
		int num=123,reversed=0;
		while(num!=0)
		{int n=num%10;
		reversed=reversed*10 + n;
		num/=10;
		}
	System.out.println("Reversed number :" + reversed);
	}

}
