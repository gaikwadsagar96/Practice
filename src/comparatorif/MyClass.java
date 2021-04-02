package comparatorif;

import java.util.ArrayList;
import java.util.Collections;

public class MyClass 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> a=new ArrayList<>();
		a.add(new Student(2, "jsdvbh", 40));
		a.add(new Student(4, "abcd", 41));
		a.add(new Student(4, "pqr", 42));
		a.add(new Student(4, "abxy", 41));
		a.add(new Student(1, "jsdvbh", 40));
		Collections.sort(a,new MarksComparator());
		System.out.println(a);

	}
}
