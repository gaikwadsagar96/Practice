package march24;
import java.util.*;
public class ThreeDArraySort
{
	public static void main(String args[])
	{
			int a[][][]={
						{{3,1,2,},{6,5,4},{9,8,7}},
						{{11,13,12},{14,16,15},{17,19,18}},
						{{21,24,23},{24,26,25},{27,29,28}}
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
								if(a[i][j][k]<a[l][m][n])
								{
									int t=a[l][m][n];
									a[l][m][n]=a[i][j][k];
									a[i][j][k]=t;
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