package corejava;
public class PrintIfElementOccurencceIsOdd 
{
	public static void main(String[] args) 
	{
		int []a= {1, 1, 1, 1, 2, 5, 5, 5, 4, 4, 5, 5, 5, 5, 5, 5, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4};
		for (int i = 0; i < a.length; i++) 
		{
			int count=0;
			int no=a[i];
			for (int j = 0; j < i; j++) 
			{
				if(a[j]==no)
					count++;
			}
			if(count==0)
			{
				int eleCount=0;
				for (int j = 0; j < a.length; j++) 
				{
					if(a[j]==no)
						eleCount++;
				}
				if(eleCount%2!=0)
				{
					System.out.print(no+" ");
				}
			}	
		}
	}
}
