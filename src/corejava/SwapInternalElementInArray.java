package corejava;

public class SwapInternalElementInArray {

	public static void main(String[] args) {
		
		int a[][]= {{1,2,3,3},
				{4,5,6,3},
				{7,8,9,3},
				{7,7,7,8}};
	for (int i = 0; i < a.length; i++) 
	{
		for (int j = 0; j < a.length; j++) 
		{
			System.out.print(a[i][j]+"\t");
		}
		System.out.println();
	}
	//swap1 with 3 and 7 with 9
	int temp=a[0][0];
	a[0][0]=a[0][a.length-1];
	a[0][a.length-1]=temp;
	temp=a[a.length-1][0];
	a[a.length-1][0]=a[a.length-1][a[1].length-1];
	a[a.length-1][a[1].length-1]=temp;
	for (int i = 0; i < a.length; i++) 
	{
		for (int j = 0; j < a.length; j++) 
		{
			System.out.print(a[i][j]+"\t");
		}
		System.out.println();
	}
	}

}
