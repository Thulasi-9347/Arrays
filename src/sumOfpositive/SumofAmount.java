package sumOfpositive;

import java.util.Scanner;

public class SumofAmount {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	System.out.println("enter the size of an array");
	int size=scan.nextInt();
	int[]arr=new int[size];
	System.out.println("enter the "+arr.length+"values");
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i]=scan.nextInt();
		
	}
	SumOfAmountApp.Amount(arr);
	}
}
