package com.kodnest.program15;

public class PerformingSearchApp {
	public static int[]linearSearch(int []arr,int key)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			if(key==arr[i])
			{
				System.out.println("key is found at index"+i);
			}
		}
		return arr;
	}
	public static boolean sortedOrNot(int arr[])
	{
		for(int i=0;i<=arr.length-1;i++)
		{
		if(arr[i]>arr[i+1])
		{
			return false;
		}
		}
		return true;
	}
	public static int[]binarySearch(int []arr,int key)
	{
			int low=0;
			int high=arr.length-1;
			
			while(low<=high)
			{
				int mid=(low+high)/2;
			if(key==arr[mid])
			{
				
				System.out.println("key"+key+" is found at index");
				break;
				
			}
			else if(key>arr[mid])
			{
				low=mid+1;
			}
			else if(key<arr[mid])
			{
				high=mid-1;
			}
			}
		
		return arr;
	}
	

}
