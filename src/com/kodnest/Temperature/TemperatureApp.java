package com.kodnest.Temperature;

public class TemperatureApp {
	public static int [] temperature(int[]arr)
	{
		int sum=0,average=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			sum+=arr[i];
			average=sum/arr.length;
			
		}
		System.out.println("the sum of all temperature are :"+average);
		return arr;
		
		
		
		
		
	}

}
