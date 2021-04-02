package corejava;

public class CharacterArrayremoveCountMinus1 
{
	public static void main(String[] args) 
	{
		char a[]= {'a','b','a','b','a','b','c','d','c','a'};
		int countArray[]=new int[128];
		for (int i = 0; i < a.length; i++) 
		{
			int c=a[i];
			countArray[c]=countArray[c]+1;//increment value inside of count array to plus 1
		}
		for (int i = 0; i < countArray.length; i++)
		{
			if(countArray[i]>1)//to adjust we have to decrement values for 1 count
				countArray[i]--;
		}
		String s="";
		for (int i = 0; i < a.length; i++) 
		{
			char ch=a[i];
			if(countArray[ch]>0)
			{
				s=s+ch; //append string if count not equals to zero 
				countArray[ch]--; //decrement count in count array
			}		
		}
		System.out.println(s);
	}

}














