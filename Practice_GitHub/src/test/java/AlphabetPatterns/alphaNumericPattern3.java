package AlphabetPatterns;

public class alphaNumericPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=0;i<n;i++) {
			char ch='A';
			int num=1;
			for(int j=0;j<n;j++) {
				if(j%2==0) {
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
