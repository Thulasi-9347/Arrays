package com.kodnest;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=scan.nextInt();
		int []arr=new int[size];
		System.out.println("enter the elements in a array");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("enter the key to be search");
		int key=scan.nextInt();
		
		 binearySearch(arr,key)	;
	}

	
		
	

	public static void binearySearch(int []arr,int key) {
		int first=0;
		int last=arr.length-1;
		//checking the key until low>=high
		 while(first<=last)
		 {
			 //checking if key is present at mid index
			 int mid=(first+last)/2;
		 
		 if(arr[mid]==key)
		 {
			 //if key is present,stop the searching ,and send the control back
			 System.out.println("key found");
			 break;
		 }
		 else if(key>arr[mid])
		 {
			 //checking if key is greater than the element is present at mid index
			 first=mid+1;
			 last=last;
		 }
		 //this will execute if key is lesser than the element is present at  mid index
		 else 
		 {
			 first=first;
			 last=mid-1;
		 }
		 //if key is not present in the array
		 if(first>last)
		 {
			System.out.println("key is not found"); 
			break;
		 }
		 }
	
	}
}
