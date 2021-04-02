package corejava;

public class DeferenceBetweenSIandCI 
{

	public static void main(String[] args) 
	{
		int p=100000;
		int r=11;
		int T=3;
		int n=T*4;//quaterly compund interest
		
		//p*(1+(r/100*n))^nt;
		int CI=p*(1+(r/(100*T)));
			CI=(int) Math.pow(CI, n);
			System.out.println(CI);

	}

}
