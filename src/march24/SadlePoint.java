package march24;

public class SadlePoint
{
	public static void main(String args[])
	{
		int[][]a={{6,3,1},
					{9,7,8},
					{2,4,5}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				boolean chhotaInRow=true;
				for(int k=0;k<a.length;k++)
				{
					if(a[i][k]<a[i][j])
					{
						chhotaInRow=false;
					}
				}
				boolean motaInCol=true;
				for(int k=0;k<a.length;k++)
				{
					if(a[k][j]>a[i][j])
					{
						motaInCol=false;
					}
				}
				if(chhotaInRow && motaInCol)
					System.out.println(a[i][j]);
			}
		}	
	}
}