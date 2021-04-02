
public class SaddlePoint 
{
	private static void saddlePoint(int[][] a) 
	{
		int min,max,col,t=1;
		for (int i = 0; i < a.length; i++) 
		{
			min=a[i][0];
			col=0;
			//samallest in row
			for (int j = 0; j < a.length; j++) 
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
					col=j;
				}
			}
			max=a[0][col];
			//max in col
			for (int k = 0; k < a.length; k++) 
			{
				if(a[k][col]>max)
				{									
					max=a[k][col];					
				}												
			}
			if(max==min) 
			{
				System.out.println("saddle number:"+max);
				t=0;
			}
		}
		if(t!=0)
			System.out.println("no saddle point");
		
	}
	public static void main(String[] args) 
	{
		int a[][]= {{5,2,9},
					{4,3,9},
					{4,9,8}};
			saddlePoint(a);
	}
}
