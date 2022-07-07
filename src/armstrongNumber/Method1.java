package armstrongNumber;

public class Method1 {

	public static void main(String[] args) {
		int originalnum=407;
		int digits=0;
		int reminder;
		int result=0;
		int count=originalnum;
		while(count>0)
		{
			count/=10;
			digits++;
		}
		
		int num=originalnum;
		for(int i=0;i<digits;i++)
		{
			reminder=num%10;
			result+=Math.pow(reminder, digits);
			num/=10;
		}
		
		if(result==originalnum)
		{
			System.out.println("Number is Armstrong Number");
		}
		else
		{
			System.out.println("Number is not Armstrong Number");
		}

	}

}
