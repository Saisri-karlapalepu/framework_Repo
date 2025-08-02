package AlphabetPatterns;

public class Duplicate_Elements_In_An_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,13,10,2,26,35,13,5,5,80,42,64};
		int[] arr1=new int[arr.length];
		for(int i=1;i<arr.length;i++) {
			int num=arr[i-1],count=0;
			boolean isPresent=false;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==num) {
					count++;
				}
			}
			for(int k=0;k<i;k++) {
				if(arr1[k]==num) {
					isPresent=true;
				}
			}
			if(isPresent==false && count>1) {
				arr1[i-1]=num;
				System.out.println(num+":"+count);
			}
		};

	}

}
