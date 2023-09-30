package com.kodnest;

public class Search {
	//method to perform linear search
	public static String linearSearch(int arr[],int key1) {
		//loop to check all the elements in array
		for(int i=0;i<=arr.length-1;i++)
		{
			//condition to compare the key with arr[i]
			if(key1==arr[i])
			{
				return(key1+"is present in the index"  +i);
				
			}
				
			
		}
		
		return(key1+" is not present in the index");
		
	}


}
