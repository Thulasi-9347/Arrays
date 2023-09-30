package com.kodnest.CountingGrades;

public class CountingApp {
	public static int[]grades(int []arr)
	{
		int count=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			
			if(arr[i]>=0 && arr[i]<=100)
			{
				if(arr[i]>75)
				{
					count++;
				}
				
			}
			
		}
		System.out.println("the number of students got scored above 75 :"+count);
				
		return arr;
	}

}
