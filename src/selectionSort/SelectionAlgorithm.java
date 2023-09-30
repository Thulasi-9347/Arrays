package selectionSort;

public class SelectionAlgorithm {
	public static int[] selection(int arr[])
	{
		
		for(int i=0;i<=arr.length-2;i++)
		{
			int min=arr[i];
		int pos=i;
			for(int j=(i+1);j<=arr.length-1;j++)
			{
				
				if(min>arr[j])
				{
					min=arr[j];
					pos=j;
				}
			}
			int temp;
			temp=arr[pos];
			arr[pos]=arr[i];
			arr[i]=temp;
			
		}
		return arr;
		
	}

}
