package sumOfpositive;

public class SumOfAmountApp {
	public static int[]Amount(int []arr)
	{
		int count=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>=0)
			{
				count+=arr[i];
			}
		}
		System.out.println("the sum of positive amount in a array"+" "+count);
		return arr;
	}

}
