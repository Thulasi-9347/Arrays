package com.kodnest.Negative;

public class NegativeApp {
	public static int[] negative(int arr[])
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			//if the value is a negative number
			if(arr[i]<0)
			{
				//replacing the negative value as 0
				arr[i]=0;
			}
			
		}
		return arr;
		
	}

}
