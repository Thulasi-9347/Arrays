package com.kodnest.sort;
import java.util.Scanner;
public class Swap {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the num1 value");
		int num1=scan.nextInt();
		System.out.println("enter the num2 value");
		int num2=scan.nextInt();
		System.out.println("before swapping:"+num1+"and"+num2);
		int num3=num1;
		num1=num2;
		num2=num3;
		System.out.println("after swapping"+num1+"and"+num2);
	}

}
