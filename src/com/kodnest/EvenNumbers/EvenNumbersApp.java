package com.kodnest.EvenNumbers;

public class EvenNumbersApp {
	public static int[]even(int []arr)
	{
		int count=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				count++;
			}
		}
		System.out.println("the number of even numbers in a array is"+count);
		return arr;
	}

}
