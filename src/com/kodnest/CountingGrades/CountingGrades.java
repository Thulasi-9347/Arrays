package com.kodnest.CountingGrades;
import java.util.Scanner;
public class CountingGrades {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//asking the user to tell size of a class
		System.out.println("enter the size of class");
		int size=scan.nextInt();
		//creating an array
		int []arr=new int[size];
		//storing the grades of arr.length students
		System.out.println("enter the grades "+arr.length+" students");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		CountingApp.grades(arr);
		
		
	}
	

}
