package problem;

import java.util.Arrays;

public class AnagramString {

	public void checkAnagram(String s1,String s2) {
		s1=s1.replaceAll("\\s", "");		s2=s2.replaceAll("\\s", "");

		if(s1.length()==s2.length()){
			char[] arrS1= s1.toLowerCase().toCharArray();
			char[] arrS2= s2.toLowerCase().toCharArray();
			Arrays.sort(arrS1);Arrays.sort(arrS2);
			if(Arrays.equals(arrS1, arrS2)) {
				System.out.println("String "+s1+","+s2+" are anagrams");
			}else {
				System.out.println("String "+s1+","+s2+" are not anagrams ,characters mismatch");
			}
		}else {
			System.out.println("String "+s1+","+s2+" are not anagrams ,length mismatch");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnagramString as = new AnagramString();
		as.checkAnagram("keep", "accha");
		as.checkAnagram("keep", "peek");
		as.checkAnagram("Mother In Law", "Hitler Woman");
	}

}
