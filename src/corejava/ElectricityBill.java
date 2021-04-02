package corejava;

public class ElectricityBill 
{
	public static void main(String[] args) 
	{
		double units=230;
		double bill=0;
		if(units>=50)
		{
			bill=50*0.5;
			units=units-50;
		}
		else 
		{
			bill=units*0.5;
			units=0;
		}
		if(units>0)
		{
			if(units>100)
			{
				bill=bill+(100*0.75);
				units=units-100;
			}
			else
			{
				bill=bill+(units*0.75);
						units=0;
			}
			if(units>0) 
			{
				if(units>100)
				{
					bill=bill+(100*1.2);
					units=units-100;
				}
				else
				{
					bill=bill+(units*1.2);
					units=0;
				}
				if(units>0)
				{
					bill=bill+(units*1.5);
				}
			}
		}
		bill=1.2*bill;
		System.out.println(bill);
	}

}


























