package com.kodnest.program15;
import java.util.Scanner;
public class PerformingSearch {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=scan.nextInt();
		int []arr=new int[size];
		System.out.println("enter the"+arr.length+"to be stored");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("enter the key that u want to search");
		int key=scan.nextInt();
		
		System.out.println("enter the searching method thet u want to perform");
		int method=scan.nextInt();
		switch(method)
		{
		case 1:PerformingSearchApp.linearSearch(arr,key);
		break;
		case 2:boolean res=PerformingSearchApp.sortedOrNot(arr);
		if(res==true)
		{
			PerformingSearchApp.binarySearch(arr, key);
		}
		else
		{
			System.out.println("enter the elements in sorted order");
		}
	}

}
}