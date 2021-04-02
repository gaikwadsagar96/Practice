/*
given 2 sorted arrays of integers,print common elements between two arrays in single loop
*/
package march15;

public class CommonElementinArray 
{

	public static void main(String[] args) 
	{
		//int a1[]= {1,3,4,5,7};
		int a1[]= {2,5,6,};
		//int a2[]= {2,3,5,6};
			int a2[]= {4,6,8,10};
		int i=0,j=0;
		while(true)
		{
			if(a1[i]==a2[j])
			{
				System.out.println(a1[i]);
				i++;j++;
				if(i>=a1.length || j>=a2.length)
					break;
			}
			else if(a1[i]<a2[j])
			{
				i++;
				if(i>=a1.length)
					break;
			}
				
			else
			{
				j++;
				if(j>=a2.length)
					break;
			}
		}

	}

}
