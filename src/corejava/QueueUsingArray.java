package corejava;

public class QueueUsingArray 
{
	static int []a=new int[5];
	static int index=0;
	private static void insert(int data) 
	{
		if(index>a.length-1)
		{
			System.out.println("Queue is full");
			
		}
		else
			a[index++]=data;
	}
	private static int delete() {
		if(index<1)
			System.out.println("Queue is empty");
		else
		{
		int data=a[0];
		for (int i = 0; i < index-1; i++) 
		{
			a[i]=a[i+1];
		}
		index--;
		a[index]=0;
		return data;
		}
		return index;
	}
	private static void print() {
	 for (int i = 0; i < index; i++) 
	 {
		System.out.print(a[i]+" ");
	 }		
	 System.out.println();
	}
	public static void main(String[] args) 
	{
		delete();
		insert(5);
		print();
		insert(10);
		print();
		insert(15);
		print();
		insert(20);
		print();
		insert(25);
		print();
		insert(30);
		print();
		
	}
}
