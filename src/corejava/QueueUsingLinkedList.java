package corejava;
class Node
{
	int data;
	Node next;
	
	public Node(int data) {
		super();
		this.data = data;
	}
	public int getData() 
	{
		return data;
	}
	public void setData(int data) 
	{
		this.data = data;
	}	
}
public class QueueUsingLinkedList 
{
	static Node head;;
	private static int delete()
	{
		if(head==null)
		{
			System.out.println("its empty");
			return 0;
		}
		else
		{
			int data=head.data;	
			head=head.next;
			return data;
		}
	}
	private static void add(int i) 
	{
		if(head==null)
		{
			head=new Node(i);
		}
		else
		{
			Node p = head;
			while(p.next!=null)
				p=p.next;
			p.next=new Node(i);
		}
	}
	private static void print() 
	{
		Node p=head;	
		while(p!=null)
		{
			System.out.print(p.data+" ");
			p=p.next;
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		add(5);
		//delete();
		print();
	}
	
	
	

}
