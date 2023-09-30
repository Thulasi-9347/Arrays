package com.kodnest.bubblesortBinary;

import java.util.Scanner;

import com.kodnest.Search;

public class BubbleLinearSearch {
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
		//displaying the elements before sorting
				System.out.println("before sorting the elements are :");
			for(int x:arr)
			{
				System.out.println(x+" ");
			}
			//performing sorting
			int []sortedarr=bubblesearch(arr);
			//displaying the elements after sorting
			System.out.println("after sorting the elements are :");
			for(int x:sortedarr)
			{
				System.out.println(x+" ");
			}
		System.out.println("enter the key element that you want to search");
		int key1=scan.nextInt();
		
		System.out.println(Search.linearSearch(arr, key1));
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
	public static String linearSearch(int arr[],int key1) {
		//loop to check all the elements in array
		for(int i=0;i<=arr.length-1;i++)
		{
			//condition to compare the key with arr[i]
			if(key1==arr[i])
			{
				return(key1+"is present in the index"  +i);
				
			}
				
			
		}
		
		return(key1+" is not present in the index");
		
	}
}
