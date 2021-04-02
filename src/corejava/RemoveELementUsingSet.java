package corejava;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveELementUsingSet 
{
	public static void main(String[] args) 
	{
		int[] a= {1,1,1,2,2,2,2,3,3,3,3};
		Set<Integer> set=new LinkedHashSet<>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		System.out.println(set);
	}
}
