package com.kodnest;
import java.util.Scanner;
public class LinearSearchApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=scan.nextInt();
		int []arr=new int[size];
		System.out.println("enter the elements of an array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("enter the key element that you want to search");
		int key1=scan.nextInt();
		
		System.out.println(Search.linearSearch(arr, key1));
	}
	

}
