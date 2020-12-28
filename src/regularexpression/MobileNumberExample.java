package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("[0|91][789][0-9]{9}");//initialdigit will be 0 or 91 in case in india,
		// followed by 1stnumber that can be 7 or 8 or 9  followed by 9 time any of 0-9 digit
		Matcher m = p.matcher("919876543210");
		while(m.find()) {
			System.out.println("Matched phone number : "+m.group());
		}

	}

}
