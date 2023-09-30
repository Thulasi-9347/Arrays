package com.kodnest.Positive;

import java.util.Scanner;

public class PositiveValues {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=scan.nextInt();
		int[]arr=new int[size];
		System.out.println("enter the values"+arr.length);
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
			
		}
		for(int x:arr)
		{
			if(x>0)
				System.out.println(x);
		}
		
	}




}
