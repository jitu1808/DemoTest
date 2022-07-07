package reverseStringAndNumber;

public class ReverseString {

	public static void main(String[] args) {
		
		String s ="jitendra";
		String reverse="";
		
		for(int i=1; i<=s.length();i++)
		{
			char re=s.charAt((s.length())-i);
			//reverse=reverse+re;
			reverse+=re;
		}
		System.out.println("Original String is- "+s);
		System.out.println("Revese String is- "+reverse);

	}

}
