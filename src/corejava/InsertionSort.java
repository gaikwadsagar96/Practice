package corejava;

import java.util.Arrays;

public class InsertionSort 
{

	public static void main(String[] args) 
	{
		int a[]= {7,8,2,4,6,3};//7,8,5,2,4,6,3
		for (int i = 1; i < a.length; i++) 
		{
			for (int j = i; j >0 ; j--) //insertion sort start with second element
			{
				if(a[j]>a[j-1])//it cheks if previous array is sorted
				{
					break;
				}
				else//if previous aray is not sorted then swap
				{
					int t=a[j];
					a[j]=a[j-1];
					a[j-1]=t;
				}
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
