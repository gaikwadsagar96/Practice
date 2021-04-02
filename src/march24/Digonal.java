package march24;
import java.util.*;
public class Digonal
{
	public static void main(String args[])
	{
		int a[][]={{1,2,3,4},
				{5,6,7,8},
				{9,0,1,2},
				{3,4,5,6}
		};
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(j-i!=0 && i+j!=3)
					list.add(a[i][j]);
			}
		}
		System.out.println(list);
	}
}