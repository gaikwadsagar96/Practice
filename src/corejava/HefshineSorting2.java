package corejava;

import java.util.Arrays;

public class HefshineSorting2 
{
	public static void main(String[] args) 
	{
		int a[]= {7,8,5,4,6,2,3};
		int start=0;
		int end=a.length-1;
		int minIndex=0;
		int maxindex=0;
		System.out.println(Arrays.toString(a));
		while(end>start)
		{
			//System.out.println(Arrays.toString(a));
			minIndex=start;
			maxindex=end;
			for (int i =start; i <=end; i++) 
			{
				if(a[i]<a[minIndex])
					minIndex=i;
				if(a[i]>a[maxindex])
					maxindex=i;
			}
			//swap min
			int temp=a[start];
			a[start]=a[minIndex];
			a[minIndex]=temp;
			//swap max
			temp=a[end];
			a[end]=a[maxindex];
			a[maxindex]=temp;
			start++;
			end--;
			//System.out.println(Arrays.toString(a));
		}
		System.out.println(Arrays.toString(a));
	}

}
