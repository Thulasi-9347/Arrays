package com.kodnest.sort;

import java.util.Scanner;

public class ArraySwapping {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of an array ");
		int num=scan.nextInt();
		
		int []arr=new int [num];
		System.out.println("enter the values to be stored:"+arr.length);
		for(int i=0;i<=arr.length-1;i++)
		{
			
				arr[i]=scan.nextInt();
				
	
		}
		System.out.println("enter the indexes in the range 0 and"+arr.length);
		int i1=scan.nextInt();
		int i2=scan.nextInt();
		int temp;
		System.out.println("before swapping the elements are");
		for(int x:arr)
		{
		System.out.println(x);
		}
		temp=arr[i1];
		arr[i1]=arr[i2];
		arr[i2]=temp;
		System.out.println("after swapping the elements are");
		for(int x:arr)
		{
		System.out.println(x);
		}
	}
}
