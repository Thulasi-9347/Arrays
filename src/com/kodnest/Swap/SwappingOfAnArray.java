package com.kodnest.Swap;


import java.util.Scanner;

public class SwappingOfAnArray {
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
		
		System.out.println("enter the 2 indexs to swap");
		int n=scan.nextInt();
		int m=scan.nextInt();
		int temp=arr[1];
		arr[1]=arr[2];
		arr[2]=temp;
		System.out.println("after swapping the elements are:");
		for(int x:arr)
		{
			System.out.println(x);
		}
		
	}


}
