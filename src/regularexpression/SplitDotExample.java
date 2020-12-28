package regularexpression;

import java.util.regex.Pattern;

public class SplitDotExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("\\.");
		String[] arr1 = p.split("www.durgajobs.com");
		for(String s: arr1) {
			System.out.println("Split of string: "+s);
		}
		
		Pattern p1 = Pattern.compile("[.]");
		String[] arr2 = p1.split("www.facebook.com");
		for(String s1: arr2) {
			System.out.println("Split of string: "+s1);
		}
	}

}
