/*
[1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4]
[1, 2, 2, 3, 3, 3, 4, 4, 4, 4]
*/
package corejava;
import java.util.Arrays;
public class RemoveRepeatedElement 
{
	public static void main(String[] args) 
	{
		int []a= {1,1,1,1,2,5,5,5,4,4,5,5,5,5,5,5,2,2,3,3,3,3,3,4,4,4,4,4,4};
		System.out.println(Arrays.toString(a));
		int count=0;
		for (int i = 0; i < a.length; i++)
		{
			int tempcount=0;
			int no=a[i];
			for (int j = 0; j < i; j++) 
			{
				if(a[j]==no)
					tempcount++;
			}
			if(tempcount<no)
				count++;
		}
		int b[]=new int[count];
		int index=0;
		for (int i = 0; i < a.length; i++) 
		{
			int tempcount=0;
			int no=a[i];
			for (int j = 0; j < i; j++) 
			{
				if(a[j]==no)
					tempcount++;
			}
			if(tempcount<no)
			{
				b[index++]=no;
			}
		}
		System.out.println(Arrays.toString(b));
	}

}
