package reverseStringAndNumber;

public class ReverseNumber {

	public static void main(String[] args) {
		int num=5248; int count;
		int reverse=0;
		int digits=0;
		// find the number of digits 
		count=num;
		while(count>0)
		{
			count/=10;
			digits++;
		}
		System.out.println("Count of digits- "+digits);
		
		System.out.println("Original Number- "+num);
		for(int i=0;i<digits;i++)
		{
			int reminder=num%10;
			reverse=reverse*10+reminder;
			num=num/10;
		
		}
		
		System.out.println("Reverse Number- "+reverse);
	}

}
