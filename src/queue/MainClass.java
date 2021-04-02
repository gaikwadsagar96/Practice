package queue;

public class MainClass 
{
	public static void main(String[] args) 
	{
		MyDeQueue d=new MyDeQueue();
		d.addArStart(10);
		d.addArStart(20);
		d.addArStart(30);
		d.print();
		d.addAtEnd(60);
		d.print();
		System.out.println(d.getFromLast());
		d.print();
		System.out.println(d.getFromStart());
		d.print();
	}

}
