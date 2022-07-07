package greatestNumber;

import java.util.Scanner;

public class Method2 {

	public static void main(String[] args) {
		int a ,b,c;
		System.out.println("please enter three Numbers");
		try (Scanner s = new Scanner(System.in)) {
			a=s.nextInt();
			b=s.nextInt();
			c=s.nextInt();
		}
		if(a>b && a>c)
		{
			System.out.println("Largest Number "+a);
		}
		else if(b>c && b>a)
		{
			System.out.println("Largest Number "+b);
		}
		else
		{
			System.out.println("Largest Number "+c);
		}

	}

}
