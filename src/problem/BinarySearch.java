package problem;


public class BinarySearch {
	
	int searchNumber(int[] arr , int x) {
		int l=0,r = arr.length -1;
		while(l<=r) {
			int mid = l + (r-1)/2;
			if(arr[mid]==x)
				return mid;
			if(arr[mid]<x)
				l = mid+1;
			else
				r=mid-1;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch bs = new BinarySearch();
		int x =12; int[] arr = {2,6,9,12,78,98};
		System.out.print("Number "+x+" is present at index : "+bs.searchNumber(arr, x));
	}

}
