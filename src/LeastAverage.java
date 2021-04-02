
public class LeastAverage
{
	static int a[]={3,7,90,20,5,50,40};
	public static void main(String[] args) 
	{
		int min=Integer.MAX_VALUE;
		int k=3;
		int ind=0;
		for (int i = 0; i < a.length-k; i++) 
		{
			int avg=sum(i,k,0)/k;
			if(min>avg)
			{
				min=avg;
				ind=i;
			}
		}
		System.out.println("index : "+ind+" min average: "+min);
	}
	private static int sum(int i, int k, int j) 
	{
		if(j<k)
			return a[i]+sum(i+1,k,j+1);
		else
			return 0;
	}

}
