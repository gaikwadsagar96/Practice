/*
given undirected graph consisting of N vertices,number from 1to N and M edge  .The graph is describes by two arrays.A and B both of
length M.A pair (A[k],B[K])for k from 0 to m-1,describes an adge between vertex A[K] and vertex B[K]. Task is to assign all values from range [1..N] to the vertice
.Do it in such way that sum over all edge of the values at the edge's end point is maximal.
i.e given N=5 A[2,2,1,2],B=[1,3,4,4] the  graph has four edges (2,1),(2,3),(1,4),(2,4).in order to obtain the maximum sum of weights 
you can assign the following values to the vertices 3,5,2,4,1.

*/
package march12;

import java.util.Arrays;

public class GraphMain 
{
	public static void main(String[] args) 
	{
		int n=5;
		int A[]= {2,2,1,2};
		int B[]= {1,3,4,4};
		int count[]= {0,0,0,0,0};
		int values[]= {5,4,3,2,1};
		int id[]= {1,2,3,4,5};
		//calculate count
		for (int i = 0; i < id.length; i++) 
		{
			int p=id[i];
			int idCount=0;
			for (int j = 0; j < A.length; j++) 
			{
				if(A[j]==p)
					idCount++;
			}
			for (int j = 0; j < B.length; j++) 
			{
				if(B[j]==p)
					idCount++;
			}
			count[i]=idCount;
		}
		//System.out.println(Arrays.toString(count));
		for (int i = 0; i < id.length; i++) 
		{
			for (int j = 0; j < values.length; j++) 
			{
				if(i<j && count[i]<count[j])
				{
					//swap count
					int temp=count[j];
					count[j]=count[i];
					count[i]=temp;
					//swap id
					temp=id[j];
					id[j]=id[i];
					id[i]=temp;
				}
			}
		}
		for (int i = 0; i < values.length; i++)
		{
			System.out.println("id "+id[i]+" value: "+values[i]);
		}
	}
}










