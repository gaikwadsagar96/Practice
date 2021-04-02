package corejava;

import java.util.Scanner;

//swapping rows
public class SwapRows 
{

	public static void main(String[] args)
	{
		int a[][]= {{1,2,3},
					{4,5,6},
					{7,8,9}};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row to swap");
		System.out.println("0th  row swap with: ");
		int r1=sc.nextInt();
		System.out.println("1st row swap with: ");
		int r2=sc.nextInt();
		for (int i = 0; i < a[0].length; i++) 
		{
			int a1=a[r1][i];
			int a2=a[r2][i];
		
			a[r1][i]=a2;
			a[r2][i]=a1;
		}
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
