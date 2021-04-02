package corejava;

import java.util.Arrays;

public class MissingElement 
{

	public static void main(String[] args) {
		int []a= {4,6,7,8,9,};
		int b[]=new int[a.length+1];
		int no=a[0];
		for (int i = 0; i < b.length; i++) 
		{
			b[i]=no++;
		}
		System.out.println(Arrays.toString(b));
		
	}

}
