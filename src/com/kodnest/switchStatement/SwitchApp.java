package com.kodnest.switchStatement;

public class SwitchApp {
	public static int[] insertionAsc(int[]arr)
	{
		for(int i=1;i<=arr.length-2;i++)
		{
			int j= i-1;
			int elem=arr[i];
			while(j>=0&&arr[j]>elem)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=elem;
		}
		return arr;
		
	}
	public static int[] selectionAsc(int arr[])
	{
		
		for(int i=0;i<=arr.length-2;i++)
		{
			int min=arr[i];
		int pos=i;
			for(int j=(i+1);j<=arr.length-1;j++)
			{
				
				if(min>arr[j])
				{
					min=arr[j];
					pos=j;
				}
			}
			int temp;
			temp=arr[pos];
			arr[pos]=arr[i];
			arr[i]=temp;
			
		}
		return arr;
		
		
	}
	public static int[] bubblesearchAsc(int []arr)
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
	public static int[] insertionDsc(int[]arr)
	{
		for(int i=1;i<=arr.length-2;i++)
		{
			int j= i-1;
			int elem=arr[i];
			while(j>=0&&arr[j]<elem)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=elem;
		}
		return arr;
	}	
	public static int[] selectionDsc(int arr[])
	{
		
		for(int i=0;i<=arr.length-2;i++)
		{
			int min=arr[i];
		int pos=i;
			for(int j=(i+1);j<=arr.length-1;j++)
			{
				
				if(min<arr[j])
				{
					min=arr[j];
					pos=j;
				}
			}
			int temp;
			temp=arr[pos];
			arr[pos]=arr[i];
			arr[i]=temp;
			
		}
		return arr;
		
	}
	public static int[] bubblesearchDsc(int []arr)
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
				if(arr[j]<arr[j+1])
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
}
