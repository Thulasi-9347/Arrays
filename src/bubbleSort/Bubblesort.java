package bubbleSort;
import java.util.Scanner;
public class Bubblesort {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in)	;
	System.out.println("enter the size of an array");
	int size=scan.nextInt();
	//creating an array
	int []arr=new int[size];
	//storing the elements in an array
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
	int []sortedarr=Search.bubblesearch(arr);
	//displaying the elements after sorting
	System.out.println("after sorting the elements are :");
	for(int x:sortedarr)
	{
		System.out.println(x+" ");
	}
		
	}

}
