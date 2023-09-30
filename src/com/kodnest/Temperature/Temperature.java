package com.kodnest.Temperature;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//asking the user tell the number of days in a week
		System.out.println("enter the number of days in a week");
		int num=scan.nextInt();
		//creating an array
		int []arr=new int[num];
		//storing the grades of arr.length students
		System.out.println("enter the temperature of "+arr.length+" days");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		TemperatureApp.temperature(arr);
		
		
	}

}
