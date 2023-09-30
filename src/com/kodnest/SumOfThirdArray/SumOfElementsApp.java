package com.kodnest.SumOfThirdArray;

public class SumOfElementsApp {
	public static int[]sum(int[]arr,int[]b,int[]c)
	{
		for(int i=0;i<=c.length-1;i++)
		{
			c[i]=arr[i]+b[i];
		}
		return c;
	}

}
