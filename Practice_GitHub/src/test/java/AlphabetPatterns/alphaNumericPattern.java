package AlphabetPatterns;

public class alphaNumericPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1,n=4;
		char ch='A';
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i%2==0) {
					System.out.print(ch+" ");
					ch++;
				}
				else {
					System.out.print(num+" ");
					num++;
				}
			}
			System.out.println();
		}

	}

}
