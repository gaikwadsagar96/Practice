package march9;

import java.util.Comparator;

public class StringComparator implements Comparator<String>
{

	public int compare(String s1, String s2) 
	{
		int c1=s1.charAt(0);
		int c2=s2.charAt(0);
		double dist1=c1-109.5;
		double dist2=c2-109.5;
		if(dist1<0)
			dist1=dist1*-1;
		if(dist2<0)
			dist2=dist2*-1;
		if(dist1>dist2)
			return -1;
		else if(dist1<dist2)
			return 1;
		else
		{
			if(c1<c2)
				return -1;
			else if(c1>c2)
				return 1;
			else
				return 0;
		}
	}

}
