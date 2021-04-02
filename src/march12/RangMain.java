/*
You have to write a java program.Create a class called DateMerger.this class should have a method called mergerDates.This method takes a list of 
class DateRange which has member variable startdate endDate.
this function should scan list of passed date ranges and merge those date ranges.
for example
01 jan 2014-30 jan 2014
15 jan 2014-15 feb 2014
10 mar 2014-15 Apr 2014
10 apr 2014-15 may 2014
the output should be
01 jan 2014- 15 feb 2014
10 mar 2014- 15 may 2014 
*/
package march12;

import java.util.ArrayList;
import java.util.List;

public class RangMain 
{

	public static void main(String[] args) 
	{
		List<Range> l=new ArrayList<>();
		l.add(new Range(1, 30));
		l.add(new Range(15, 45));
		l.add(new Range(100, 135));
		l.add(new Range(70,105));
		
		for (int i = 0; i < l.size(); i++) 
		{	
			for (int j = 0; j < l.size(); j++) 
			{
				Range iwo=l.get(i);
				Range jwo=l.get(j);
				if(i!=j && iwo.start<jwo.start&&iwo.end>=jwo.start)
				{
					if(jwo.end>iwo.end)
						iwo.end=jwo.end;
					l.remove(j);
					i--;
					break;
				}
			}
		}
		
		/*for (int i = 0; i < l.size(); i++) 
		{
			System.out.println(l);
		}*/
		System.out.println(l);
	}

}
