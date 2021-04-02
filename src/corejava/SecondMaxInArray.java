package corejava;

public class SecondMaxInArray 
{
	public static void main(String[] args) 
	{
		int []a= {1,2,9,4,5,6,9,9};
		int fmax=0;
		int sMax=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>fmax)
			{
				sMax=fmax;
				fmax=a[i];
			}
			if(a[i]>sMax && a[i]!=fmax)//if second max is in last then first block will not execute so this line 
			{
				sMax=a[i];
			}
		}
		System.out.println(fmax+" "+sMax);
	}
}
