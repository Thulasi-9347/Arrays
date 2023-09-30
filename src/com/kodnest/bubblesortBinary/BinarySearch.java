package com.kodnest.bubblesortBinary;
import java.util.Scanner;

import bubbleSort.Search;
public class BinarySearch {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=scan.nextInt();
		int []arr=new int[size];
		
		
		System.out.println("enter the" +arr.length+" elements to be stored");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		//displaying the elements before sorting
			System.out.println("before sorting the elements are :");
		for(int x:arr)
		{
			System.out.println(x+" ");
		}
		//performing sorting
		int []sortedarr=Search.bubblesearch(arr);
		//displaying the elements after sorting
		System.out.println("after sorting the elements are :");
		for(int x:sortedarr)
		{
			System.out.println(x+" ");
		}
		System.out.println("enter the key to be search");
		int key=scan.nextInt();
		binearySearch(arr,key);
		
	}
	public static int []bubblesearch(int []arr)
	{
		//temp variable to perform swapping
		int temp;
		//picking all the elements in an array
		for(int i=0;i<=arr.length-2;i++)
		{
			
			for(int j=0;j<=arr.length-i-2;j++)
			{
				//comparing the element with its next index value
				//if the value is greater then swap it
				if(arr[j]>arr[j+1])
				{
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//returning the sorted array
		return arr;

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
			 System.out.println("key found in th index");
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
		 }	 }
}
