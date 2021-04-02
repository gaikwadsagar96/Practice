//hence it is proove string is immutable because when we change the contents of original string it 
//create new object and save changes into new object 
public class StringImmutable 
{
	public static void main(String[] args) 
	{
		String s1="abc";
		String s2="abc";
		check(s1,s2);
		s1="xyz";
		check(s1,s2);
	}
	private static void check(String s1, String s2) 
	{
		if(s1==s2)//== oprator check reference of object
		{
			System.out.println(s1+" "+s2);
			System.out.println("same address");
		}
		else
		{
			System.out.println(s1+" "+s2);
			System.out.println("different address");
		}	
	}
}
