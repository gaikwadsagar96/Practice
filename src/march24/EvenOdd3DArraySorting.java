package march24;
import java.util.*;
public class EvenOdd3DArraySorting
{
	public static void main(String args[])
	{
			int a[][][]={
						{{1,2,3},{4,3,2},{7,1,4}},
						{{1,2,3},{4,3,2},{7,1,4}},
						{{1,2,3},{4,3,2},{7,1,4}}
						};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
					for(int l=0;l<a.length;l++)
					{
						for(int m=0;m<a[i].length;m++)
						{
							for(int n=0;n<a[i][j].length;n++)
							{
								if(a[i][j][k]%2==0 && a[l][m][n]%2!=0)
								{
									int t=a[i][j][k];
									a[i][j][k]=a[l][m][n];
									a[l][m][n]=t;
								}
							}
						}
					}
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
					for(int l=0;l<a.length;l++)
					{
						for(int m=0;m<a[i].length;m++)
						{
							for(int n=0;n<a[i][j].length;n++)
							{
								if(a[i][j][k]%2==0 && a[l][m][n]%2==0 && a[i][j][k]>a[l][m][n])
								{
									int t=a[i][j][k];
									a[i][j][k]=a[l][m][n];
									a[l][m][n]=t;
								}
								if(a[i][j][k]%2!=0 && a[l][m][n]%2!=0 && a[i][j][k]>a[l][m][n])
								{
									int t=a[i][j][k];
									a[i][j][k]=a[l][m][n];
									a[l][m][n]=t;
								}
							}
						}
					}
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				for(int k=0;k<a.length;k++)
				{
						System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}