package corejava;

import java.util.Arrays;

public class Sort2Arrays 
{
	public static void main(String[] args) 
	{
		int a[]={1,9,3,5,7};
		int b[]={6,4,8,2,0};
		
		for (int i = 0; i < a.length+b.length; i++) 
		{
			for (int j = 0; j< a.length + b.length; j++) 
			{
				if(i<a.length &&j<a.length && i<j && a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				else if(i>=a.length &&j>=a.length && i<j && b[i-a.length]>b[j-a.length])
				{
					int temp=b[i-a.length];
					b[i-a.length]=b[j-a.length];
					b[j-a.length]=temp;
				}
				else if(i<a.length &&j>=a.length && i<j && a[i]>b[j-a.length])
				{
					int temp=a[i];
					a[i]=b[j-a.length];
					b[j-a.length]=temp;
				}
				else if(i>=a.length && j<a.length && i<j && b[i-a.length]>a[j])
				{
					int temp=b[i-a.length];
					b[i-a.length]=a[j];
					a[j]=temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(a)+Arrays.toString(b));
	}

}





























