package fibonacci;

public class Method2 {

	public static void main(String[] args) {
		int firstTerm =0;
		int secondTerm=1;
		int n=10;
		int j=0;
		while(j<n)
		{
			System.out.print(firstTerm+ ", ");
			int nextTerm =firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;
			
			j++;
		}
	}

}
