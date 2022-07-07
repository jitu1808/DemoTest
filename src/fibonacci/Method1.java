package fibonacci;

public class Method1 {

	public static void main(String[] args) {
		
		int firstTerm =0;
		int secondTerm=1;
		int n=10;
		int j=0;
		
		for(int i=0;i<n;i++)
		{
			System.out.print(firstTerm+ ", ");
			int nextTerm =firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;
		}
		while(j<n)
		{
			
		}
	

	}

}
