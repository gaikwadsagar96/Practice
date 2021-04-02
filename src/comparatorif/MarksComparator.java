package comparatorif;

import java.util.Comparator;

public class MarksComparator implements Comparator<Student>
{
	@Override
	public int compare(Student s1, Student s2) 
	{
		if(s1.marks>s2.marks)
			return -1;
		 else if(s1.marks<s2.marks)
			 return 1;
		 else
		 {
			 if(s1.name.charAt(1)>s2.name.charAt(1))
			 {
				 return -1;
			 }
			 else if(s1.name.charAt(1)<s2.name.charAt(1))
			 {
				 return 1;
			 }
			 else
			 {
				 if(s1.name.charAt(2)>s2.name.charAt(2))
				 {
					 return -1;
				 }
				 else if(s1.name.charAt(2)==s2.name.charAt(2))
				 {
					 return 1;
				 }
				 else
				 {
					 if(s1.rn>s2.rn)
						 return 1;
					 else if(s1.rn>s2.rn)
						 return -1;
					 else 
						 return 0;
				 }	 
			 }
		 }
	}

}
