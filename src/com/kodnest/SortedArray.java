package com.kodnest;

import java.util.Scanner;

public class SortedArray {
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
	boolean res=SortedArrayApp.sorted(arr);
	if(res==true)
	{
		System.out.println("array is sorted");
	}
	else
	{
		System.out.println("array is not sorted");
	}
	}
}
