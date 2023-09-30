package com.kodnest.Negative;
import java.util.Scanner;
public class NegativeNumbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//asking the user to create an array
		System.out.println("enter the size of an array");
		int size=scan.nextInt();
		int []arr=new int[size];
		System.out.println("enter the"+arr.length+"elements to be stored");
		//storing the elements in a array
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		int[] replace=NegativeApp.negative(arr);
		//after replacing the negative value .displaying the sorted array
		System.out.println("after replacing the elements are");
		for(int x:replace)
		{
			System.out.println(x);
		}
	}

}
