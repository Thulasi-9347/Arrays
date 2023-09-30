package com.kodnest.SumOfThirdArray;
import java.util.Scanner;
public class SumOfElements {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=scan.nextInt();
		int []arr=new int[size];
		int []b=new int[size];
		System.out.println("enter the elements in first array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("enter the elements in second array");
		for(int i=0;i<=arr.length-1;i++)
		{
			b[i]=scan.nextInt();
		}
		int []sum=SumOfElementsApp.sum(arr, b, b);
		System.out.println("sum of elements are :");
		for(int x:sum)
		{
			System.out.print(" "+x);
		}
	}
	

}
