package AlphabetPatterns;

public class alphaNumericPattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4,num=1;
		char ch='A';
		for(int i=0;i<n;i++) {
			char ch1=ch;
			int num1=num;
			for(int j=0;j<n;j++) {
				if(j%2==0) {
					System.out.print(ch1+" ");
					ch1=(char) (ch1+n);
				}
				else {
					System.out.print(num1+" ");
					num1=num1+4;
				}
			}
			ch++;
			num++;
			System.out.println();
		}

	}

}
