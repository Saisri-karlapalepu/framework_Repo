package AlphabetPatterns;

public class alphaNumericPattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4,num=1;
		for(int i=0;i<n;i++) {
			char ch='A';
			int num1=num;
			for(int j=0;j<n;j++) {
				if(j%2==0) {
					System.out.print(ch+" ");
					ch++;
				}
				else {
					System.out.print(num1+" ");
					num1=num1+n;
				}
			}
			num++;
			System.out.println();
		}

	}

}
