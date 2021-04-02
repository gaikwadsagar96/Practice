/*
sort data according to marks if marks same then sort on names 2nd character if 2nd character is same then sort on 
3rd character if 3rd character same then sort on roll numbers
*/
package corejava;
class Student
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
		return "Student [rn=" + rn + ", name=" + name + ", marks=" + marks
				+ "]";
	}
}
public class SortStudent 
{
	public static void main(String[] args) 
	{
		Student[] a=new Student[5];
		a[0]=new Student(2, "jsdvbh", 40);
		a[1]=new Student(4, "abcd", 41);
		a[2]=new Student(4, "pqr", 42);
		a[3]=new Student(4, "aabxy", 41);
		a[4]=new Student(1, "jsdvbh", 40);
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i].marks<a[j].marks)
				{
					Student temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				else if(a[i].marks==a[j].marks)
				{
					if(a[i].name.charAt(1)>a[j].name.charAt(1))
					{
						Student temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
					else if(a[i].name.charAt(1)==a[j].name.charAt(1))
					{
						if(a[i].name.charAt(2)>a[j].name.charAt(2))
						{
							Student temp=a[i];
							a[i]=a[j];
							a[j]=temp;
						}
						else if(a[i].name.charAt(2)==a[j].name.charAt(2))
						{
							if(a[i].rn>a[j].rn)
							{
								Student temp=a[i];
								a[i]=a[j];
								a[j]=temp;
							}
						}
					}
				}
			}
		}
		for(Student s:a)
			System.out.println(s);
		
	}
	

}










