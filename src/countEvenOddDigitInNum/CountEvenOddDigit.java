package countEvenOddDigitInNum;

public class CountEvenOddDigit {

	public static void main(String[] args) {
		int num=16348;
		int rem;
		int evenCount=0;
		int oddCount=0;
		
		while(num>0)
		{
			rem=num%10;
			if(rem%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
			num/=10;
			
		}
		System.out.println("Count of Even digits in Number- "+evenCount);
		System.out.println("Count of odd digits in Number- "+oddCount);

	}

}
