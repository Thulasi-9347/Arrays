package mandatorySession;
import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of rows of an array");
		byte size=scan.nextByte();
		System.out.println("enter the number of columns");
		byte col=scan.nextByte();
		byte [][]arr=new byte[size][col];
		System.out.println("enter the elements of an array");
		for(byte i=0;i<=arr.length-1;i++)
		{
			for(byte j=0;j<=arr[i].length-1;j++)
			{
				arr[i][j]=scan.nextByte();

			}
		}
		System.out.println("the elements are");
		
		for(byte i=0;i<=arr.length-1;i++)
		{
			for(byte j=0;j<=arr[i].length-1;j++)
			{
				System.out.println(arr[i][j]);

			}
		}
		
	}

}
