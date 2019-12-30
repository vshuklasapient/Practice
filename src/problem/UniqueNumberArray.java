package problem;

import java.util.ArrayList;

public class UniqueNumberArray {
		void getUniqueNumber(int[] arr) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for (int i=0;i <arr.length-1;i++) {
				if(!temp.contains(arr[i]))
					temp.add(arr[i]);
			}
			System.out.println(temp);
		}
		
		public static void main(String[] args) {
			UniqueNumberArray un = new UniqueNumberArray();
			int[] arr = {1,1,1,3,3,6,7,8,8,8,8,9,9,9,9,9,9,9};
			un.getUniqueNumber(arr);
		}
}
