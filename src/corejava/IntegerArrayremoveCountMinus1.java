package corejava;

public class IntegerArrayremoveCountMinus1 
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,1,2,3,1,2,1};
		int b[]=new int [a.length];
		int index=0;
		for (int i = 0; i < a.length; i++) 
		{
			int precount=0;
			int postCount=0;
			for (int j = 0; j < i; j++) 
			{
				if(a[j]==a[i])
					precount++;
			}
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[j]==a[i])
					postCount++;
			}
			if(precount==0 || postCount>0)
			{
				b[index++]=a[i];
			}
		}
		for (int i = 0; i < b.length; i++) {
			if(b[i]!=0)
			{
				System.out.print( b[i]+" ");
		
			}
		}

	}

}













