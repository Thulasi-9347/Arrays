package com.kodnest.PrintArray;

import java.lang.reflect.Array;
import java.util.Scanner;

public class PrintArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	System.out.println("enter the size of an array");
	int size=scan.nextInt();
	int[]arr=new int[size];
	System.out.println("enter the "+arr.length+"values");
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i]=scan.nextInt();
		
	}
	System.out.println("arrays in reverse order :");
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.println(arr[i]);
	}
	
	}
}
