package comparableif;
public class Student implements Comparable<Student>
{
	int rn;
	String name;
	int marks;
	
	
	public Student(int rn, String name, int marks) {
		super();
		this.rn = rn;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rn=" + rn + ", marks=" + marks + ", name=" + name
				+ "]\n";
	}
	@Override
	public int compareTo(Student s) 
	{
	 if(marks>s.marks)
		return -1;
	 else if(marks<s.marks)
		 return 1;
	 else
		 return 0;
	}
	
}
