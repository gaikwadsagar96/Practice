import java.util.Scanner;

public class StackUsingArray 
{
	int top=-1;
	int stack[]=new int[5];
	static Scanner sc=new Scanner(System.in);
	private void pop()
	{
		if(top>-1)
		{
			System.out.println("pop "+stack[top]);
			top--;
		}
		else
			System.out.println("Stack is empty");
	}
	private void push() 
	{
		if(top<stack.length-1)
		{
			top++;
			System.out.println("Enter Element to push");
			stack[top]=sc.nextInt();
		}
		else
			System.out.println("Stack is full ");
	}
	private void isFull() 
	{
			if(top==stack.length-1)
				System.out.println("Stack is full");
			else
				System.out.println("Stack is not full");
	}
	private void isEmpty() 
	{
		if(top==-1)
			System.out.println("Stack is empty\n");
		else
			System.out.println("Stack is not empty\n");
	}
	
	public static void main(String[] args) 
	{
		StackUsingArray s=new StackUsingArray();
		while(true)
		{
			System.out.println("\nEnter choice:\n 1.IsEmpty()\n2.IsFull\n3.Push\n4.Pop\n5.exit");
			int n=sc.nextInt();
			switch (n) {
			case 1:
				s.isEmpty();
				break;
			case 2:
				s.isFull();
				break;
			case 3:
				s.push();
				break;
			case 4:
				s.pop();
				break;
			case 5:
				System.exit(5);
				break;
			default:
				System.out.println("Enter right Choice!!!!!!!!!!!!\n");
				break;
			}
		}
	}
}
