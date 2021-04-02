package march24;

public class GenerateSequence
{
	static int[]a={11,22,33,44,55};
	public static void main(String args[])
	{
		int indexwalaArray[]=new int[5];
		do{
			if(allUnique(indexwalaArray))
			{
				for(int i=0;i<indexwalaArray.length;i++)
				{
					int p=indexwalaArray[i];
					int q=a[p];
					System.out.print(q+" ");
				}
				System.out.println();
			}
			addInIndexWalaArray(indexwalaArray);
		}while(indexwalaArrayIsNotFull(indexwalaArray));
	}
	private static boolean allUnique(int [] indexwalaArray)
	{
		for(int i=0;i<indexwalaArray.length;i++)
		{
			for(int j=i+1;j<indexwalaArray.length;j++)
			{
				if(indexwalaArray[i]==indexwalaArray[j])
				return false;
			}
		}
		return true;
	}		
	private static void addInIndexWalaArray(int [] indexwalaArray)
	{
		add(indexwalaArray,indexwalaArray.length-1);
	}
	private static void add(int [] indexwalaArray,int i)
	{
		if(i<indexwalaArray.length && i>=0)
		{
			if(indexwalaArray[i]<4)
				indexwalaArray[i]++;
			else
			{
				indexwalaArray[i]=0;
				add(indexwalaArray,--i);
			}
		}
	}
	private static boolean indexwalaArrayIsNotFull(int [] indexwalaArray)
	{
		for(int i=0;i<indexwalaArray.length;i++)
		{
			if(indexwalaArray[i]<4)
				return true;
		}
		return false;
	}
}