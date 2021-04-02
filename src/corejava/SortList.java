package corejava;

import java.util.ArrayList;

public class SortList 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<>();
		a.add(70);
		a.add(50);
		a.add(80);
		a.add(40);
		a.add(85);
		a.add(30);
		for (int i = 0; i < a.size(); i++) 
		{
			for (int j = i+1; j < a.size(); j++) 
			{
				if(a.get(i)<a.get(j))
				{
					int temp=a.get(i);
					a.set(i, a.get(j));
					a.set(j, temp);
				}
			}
		}
		System.out.println(a);
	}
}










