package problem;

import java.util.Arrays;

public class MaxSumofProductArrays {
	static int maxProduct,sum;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {1,7,9,2,4};
		int[] arr2 = {12,72,19,32,34};
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int arrSize = arr1.length;
		for(int i=0;i<arrSize;i++) {
			sum = sum+arr1[i]*arr2[i];
		}
		System.out.print("MAximum product of consecutive number of two arrays :"+arr1+arr2+" = "+sum);
	}

}
