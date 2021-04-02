package corejava;

public class TransposeOfMatrixElemenateDiagonal 
{

	public static void main(String[] args) 
	{
		int a[][]= {{1,2,3,4},
				{4,5,6,7},
				{7,8,9,9},
				{5,3,7,2}
		};
		int c[][]=new int[4][4];
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				if(j-i==0 ||i+j==0)
					c[i][j]=a[i][j];
				else
					c[j][i]=a[i][j];
			}
		}
		for (int i = 0; i < c.length; i++) 
		{
			for (int j = 0; j < c[i].length; j++) 
			{
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
