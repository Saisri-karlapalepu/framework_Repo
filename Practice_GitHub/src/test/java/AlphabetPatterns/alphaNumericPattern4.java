package AlphabetPatterns;

public class alphaNumericPattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4,num=1;
		char ch='A';
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i%2==0) {
					System.out.print(ch+" ");
				}
				else {
					System.out.print(num+" ");
					num++;
				}
			}
			if(i%2==0) {
				ch++;
			}
			System.out.println();
			
		}

	}

}
