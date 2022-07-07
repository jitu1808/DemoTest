package primeNo;

public class PrimeNo {

	public static void main(String[] args) {
		int num=7;
		int count=0;
		if(num>=0)
		{
			if(num==0|num==1)
			{
				System.out.println(num +" - is not Prime Number");
			}
			else 
			{
				for(int i=2;i<num;i++)
				{
					if(num%i==0)
					{
						count++;
					}
				}
				if(count==0)
				{
					System.out.println(num +" - is Prime Number");
				}
				else
				{
					System.out.println(num +" - is not Prime Number");
				}
			}
		}
		else
		{
			System.out.println(num+"- is Negative Number");
		}

	}

}
