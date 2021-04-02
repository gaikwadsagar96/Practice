/*
[1, 2, 3, 4, 5, 6, 7, 8, 9]
[8, 2, 6, 4, 5, 3, 7, 1, 9]
*/
package corejava;
import java.util.*;
public class EvenOddINOneArray 
{
	public static void main(String[] args) 
	{
		int []a= {1,56,11,19,1,2,3,99,4,5,6,7,8,9};
		System.out.println(Arrays.toString(a));
		
		//withoutchanging sequence
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]%2!=0)
			{
				int j=i;
				while(j<a.length && a[j]%2!=0)
					j++;
				if(j<a.length)
				{
				int temp=a[j];
				for (int k = j; k >i; k--)
				{
					a[k]=a[k-1];
				}
				a[i]=temp;
			}
		}
		}
		System.out.println(Arrays.toString(a));
		
		/*int i=0;
		int j=a.length-1;
		while(i<j)
		{
			while(a[i]%2==0)
				i++;
			while(a[j]%2!=0)
				j--;
			if(i<j)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		System.out.println(Arrays.toString(a));		
	*/
	/*	int i=0;
		int j=0;
		while(i<a.length || j<a.length)
		{
			while(a[i]%2==0 && i<a.length)
				i++;
			while(a[j]%2!=0 && j<a.length)
				j++;
		}
		if(i<a.length-1 || j<a.length-1)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j++;
		}*/
	}
}





















