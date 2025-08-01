package AlphabetPatterns;

public class alphaPattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1='A';
		int n=4;
		for(int i=0;i<n;i++) {
			char ch=ch1;
			for(int j=0;j<n;j++) {
			    System.out.print(ch+" ");
			    ch=(char)(ch+n);
			}
		
			System.out.println();
			ch1++;
		}
		}

	}


