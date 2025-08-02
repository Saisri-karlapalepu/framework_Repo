package AlphabetPatterns;

import java.util.Arrays;

public class Removing_Duplicates_In_An_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,5,10,10,10,2,15,23,17,36,66,74,0,89,17,23};
		int[] arr1=new int[arr.length];
		int m=1;
		arr1[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			boolean isPresent=false;
			int num=arr[i];
			for(int j=0;j<i;j++) {
				if(arr1[j]==num) {
					isPresent=true;
				}
			}
			if(isPresent==false) {
				arr1[m]=num;
				m++;
			}
		}
		for(int k=0;k<m;k++) {
			System.out.print(arr1[k]+" ");
		}
       
	}

}
