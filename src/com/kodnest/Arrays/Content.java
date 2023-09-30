package com.kodnest.Arrays;
import java.util.Scanner;
public class Content {
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
			
		
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.print("display the values :"+arr[i]);
			
			
		}
	
	
	}
	

}