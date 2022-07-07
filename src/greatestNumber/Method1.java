package greatestNumber;

import java.util.Scanner;

public class Method1 {
	public static void main(String args[]) {
	int a ,b,c;
	System.out.println("please enter three Numbers");
	Scanner s = new Scanner(System.in);
	a=s.nextInt();
	b=s.nextInt();
	c=s.nextInt();
	
	int maxValue =(a>b)?(a>c?a:c):(b>c?b:c);
	
	System.out.println("Largest Number "+maxValue);
	}
}
