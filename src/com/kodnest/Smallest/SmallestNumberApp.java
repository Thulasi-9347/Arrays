package com.kodnest.Smallest;

public class SmallestNumberApp {
	/*
	public static int Smallest(int []arr)
	{
		int min=arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
			
			if(min>=arr[i])
			{
				min=arr[i];
				
				
			}
			
		}
		System.out.println("the smallest number is"+min);
		return min;
	}
	*/
	
public static int greater(int[]arr)
{
	int min=arr[0], max=arr[0];
	for(int i=0;i<=arr.length-1;i++)
	{
		if(min<=arr[i])
		{
			
			min=arr[i];
		}
		else if(max>=arr[i])
		{
			max=arr[i];
		}
		
		
	}
	System.out.println("the greater number is"+min+"the smallest number is"+max);
	return max;
	
}
}

