package com.kodnest;

public class SortedArrayApp {
	public static boolean sorted(int []arr)
	{
		for(int i=0;i<=arr.length-2;i++)
		{
			
			if(arr[i]>arr[i+1])
			{
				return false;
			}
		}
		return true;
	
	

	
}
}