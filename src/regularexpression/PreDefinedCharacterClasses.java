package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PreDefinedCharacterClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 \s space
		 \S except space
		 \d any digit 0-9 [0-9]
		 \D except digit
		 \w any word [0-9a-zA-Z]
		 \W except word i.e special characters
		 . any character
		 */
		Pattern p = Pattern.compile("\\s");
		Matcher m = p.matcher("a7b k@9z");
		while(m.find()) {
			System.out.println("Start index for match found : "+m.start());
			System.out.println("Matched string : "+m.group());
		}
		
		Pattern p1 = Pattern.compile("\\W");
		Matcher m1 = p1.matcher("a7b k@9z");
		while(m1.find()) {
			System.out.println("Start index for match found : "+m1.start());
			System.out.println("Matched string : "+m1.group());
		}
		
	}

}
