package AlphabetPatterns;

public class Frequency_Of_Occurance_Of_An_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,52,18,2};
		int arr1[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int num=arr[i],count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==num) {
					count++;
				}
			}
			if(Contains(arr1,num)==false ) {
				System.out.println(num+":"+count);
				arr1[i]=num;
			}
		}

	}

	private static boolean Contains(int[] arr, int num) {
		// TODO Auto-generated method stub
		return false;
	}

}
