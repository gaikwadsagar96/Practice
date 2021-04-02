/*
Sort array list of String on the basis of following pattern{a-zb-y-c-x-d......}
input
ArrayList<String> a=new ArrayList<>();
		a.add("abc");
		a.add("xhsdkj");
		a.add("ysadk");
		a.add("bsdjlk");
		a.add("ckdjf");
		a.add("kajfoaeiu");
		a.add("zdsjfou");
		Output: abc , zdsjfou , bsdjlk , ysadk , ckdjf , xhsdkj , kajfoaeiu
*/
package march9;

import java.util.ArrayList;
import java.util.Collections;

public class SortString 
{
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<>();
		a.add("abc");
		a.add("xhsdkj");
		a.add("ysadk");
		a.add("bsdjlk");
		a.add("ckdjf");
		a.add("kajfoaeiu");
		a.add("zdsjfou");
		Collections.sort(a, new StringComparator());
		for(String x:a)
			System.out.print(x+" , ");
	}

	
}
