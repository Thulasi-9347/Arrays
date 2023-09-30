package insertionSort;

public class InsertionAlgorithm {
	public static int[]insertion(int[]arr)
	{
		for(int i=1;i<=arr.length-2;i++)
		{
			int j= i-1;
			int elem=arr[i];
			while(j>=0&&arr[j]>elem)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=elem;
		}
		return arr;
	}

}
