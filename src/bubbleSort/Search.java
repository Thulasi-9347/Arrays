package bubbleSort;

public class Search {
	public static int []bubblesearch(int []arr)
	{
		//temp variable to perform swapping
		int temp;
		//picking all the elements in an array
		for(int i=0;i<=arr.length-2;i++)
		{
			
			for(int j=0;j<=arr.length-i-2;j++)
			{
				//comparing the element with its next index value
				//if the value is greater then swap it
				if(arr[j]>arr[j+1])
				{
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//returning the sorted array
		return arr;
	}

}
