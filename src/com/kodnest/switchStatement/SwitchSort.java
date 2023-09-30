package com.kodnest.switchStatement;

import java.util.Scanner;

import insertionSort.InsertionAlgorithm;

public class SwitchSort {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in)	;
		System.out.println("enter the size of an array");
		int size=scan.nextInt();
		//creating an array
		int []arr=new int[size];
		//sorting the elements in an array
		System.out.println("enter the" +arr.length+" elements to be stored");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		//displaying the elements before sorting
			System.out.println("before sorting the elements are :");
		for(int x:arr)
		{
			System.out.println(x+" ");
		}
		//performing sorting
		
		System.out.println("enter the sorting algorithm that u want to perform :");
		int sorting=scan.nextInt();
		switch(sorting)
		{
		case 1:SwitchApp.bubblesearchAsc(arr);
		break;
		case 2:SwitchApp.insertionAsc(arr);
		break;
		case 3:SwitchApp.selectionAsc(arr);
		break;
		case 4:SwitchApp.bubblesearchDsc(arr);
		break;
		case 5:SwitchApp.insertionDsc(arr);
		break;
		case 6:SwitchApp.selectionDsc(arr);
		break;
		
		}
		System.out.println("after sorting the elements are:");
		for(int x:arr)
		{
			System.out.println(x);
		}
		
		
	}
}
