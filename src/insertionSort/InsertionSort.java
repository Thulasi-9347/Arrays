package insertionSort;

import java.util.Scanner;



public class InsertionSort {
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
		int []insertion=InsertionAlgorithm.insertion(arr);
		System.out.println("after sorting the elements are :");
		for(int x:insertion)
		{
			System.out.println(x);
		}
		
	}
}
