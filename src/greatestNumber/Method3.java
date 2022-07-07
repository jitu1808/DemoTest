package greatestNumber;

import java.util.Scanner;

public class Method3 {

	public static void main(String[] args) {
		int num1 ,num2,num3;
		System.out.println("please enter three Numbers");
		Scanner s = new Scanner(System.in);
		num1=s.nextInt();
		num2=s.nextInt();
		num3=s.nextInt();
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println("Largest Number "+num1);
			}
			else
			{
				System.out.println("Largest Number "+num3);
			}
		}
		else
		{
			if(num2>num3)
			{
				System.out.println("Largest Number "+num2);
			}
			else
			{
				System.out.println("Largest Number "+num3);
			}
		}
	}

}
