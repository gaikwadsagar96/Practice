package queue;
//double ended queue using singly linked list
public class MyDeQueue 
{
	Node head;
	void addArStart(int data)
	{
		if(head==null)
		{
			head=new Node(data);
		}
		else
		{
			Node p=new Node(data);
			p.next=head;
			head=p;
		}
	}
	void addAtEnd(int data)
	{
		if(head==null)
		{
			head=new Node(data);
		}
		else
		{
			Node p=head;
			while(p.next!=null)
				p=p.next;
			p.next=new Node(data);
		}
	}
	int getFromLast()
	{
		if(head==null)
			return 0;
		else if(head.next==null)
		{
			int data=head.data;
			head=null;
			return data;
		}
		else
		{
			Node p=head;
			while(p.next.next!=null)
				p=p.next;
			int data=p.next.data;
			p.next=null;
			return data;
		}
	}
	int getFromStart()
	{
		if(head==null)
		{
			return 0;
		}
		else
		{
			int data=head.data;
			head=head.next;
			return data;
		}
	}
	void print()
	{
		Node p=head;
		while(p!=null)	
		{
			System.out.print(p.data+" ");
			p=p.next;
		}
		System.out.println();
	}
}


















