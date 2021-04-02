package corejava;

class Node1
{
	int data;
	Node1 next;
}
public class StackUsingLinkedList 
{
static Node1 head;
	public static void main(String[] args) 
	{
		int a=delete();
		add(5);
		print();

	}
	private static void print() 
	{
	
		
	}
	private static void add(int i) 
	{
	
		
	}
	private static int delete() 
	{
		if(head==null)
		{
			System.out.println("Empty stack");
			return 0;
		}
		else if (head.next==null) 
		{
			int data=head.data;
			head=null;
			return data;
		}
		else
		{
			Node1 p=head;
			Node1 q=p;
			while(p.next!=null)
			{
				q=p;
				p=p.next;
			}
		}
		return 0;
	}

}
