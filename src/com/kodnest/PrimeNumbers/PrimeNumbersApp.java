package com.kodnest.PrimeNumbers;

public class PrimeNumbersApp {
	public static int[]prime(int arr[])
	{
		
			int count=0; 

			for(int i=1 ; i<=arr.length-1 ; i++) 

			{ 
				count=0;

				for(int j=2; j<=arr[i]; j++) 

			{ 

				if(arr[i]%j==0) 
					count++; 
				} 

				 

			if(count==1) 

			{ 

				System.out.println(arr[i]+"is a prime number");
			} 

			}
			return arr; 
		}
	

}
