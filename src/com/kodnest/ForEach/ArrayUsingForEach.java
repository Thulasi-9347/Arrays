package com.kodnest.ForEach;

import java.util.Scanner;

public class ArrayUsingForEach {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of an array ");
		int num=scan.nextInt();
		
		int []arr=new int [num];
		System.out.println("enter the"+arr.length +"values:");
		for(int i=0;i<=arr.length-1;i++)
		{
			
				arr[i]=scan.nextInt();
				
			}
			
			
		
	
for(int x:arr)
{
	
	System.out.println("display the values :"+(x+5));
		
		
	}
}





}
