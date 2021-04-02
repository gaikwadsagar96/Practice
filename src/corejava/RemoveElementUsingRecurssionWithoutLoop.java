package corejava;
import java.util.Arrays;
public class RemoveElementUsingRecurssionWithoutLoop 
{
	public static void main(String[] args) 
	{
		int []a= {4,4,4,41,34,4,2,4,7,5,4,4,4,4,4};
		int element=4;
		System.out.println(Arrays.toString(a));
		int count=findCount(a,element,0);
		//System.out.println(count);
		int b[]=new int[a.length-count];
		if(count==0)
			b=a;
		else
			addAinB(a,0,b,0,element);
		System.out.println(Arrays.toString(b));
	}
	private static void addAinB(int[] a, int i, int[] b, int j, int element) 
	{
		if(i<a.length &&j<b.length && a[i]!=element)
		{
			b[j]=a[i];	
			addAinB(a,++i,b,++j,element);//if not element add a in b and increament both index
		}
		else if(i<a.length &&j<b.length)
		{
			addAinB(a,++i,b,j,element);//if  element do not add and increament only a index(i) index
		}
	}
	private static int findCount(int[] a, int element, int i)
	{
		if(i<a.length && a[i]==element)
			return 1+findCount(a,element,++i);
		else if(i<a.length && a[i]!=element)
			return findCount(a,element,++i);
		return 0;
	}
}
