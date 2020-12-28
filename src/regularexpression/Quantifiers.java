package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers {//to specify number of occurances to match

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a+ atleast one a
		//a* any number of a including 0
		//a? atmost a i.e 0 or 1 a
		Pattern p= Pattern.compile("a+");
		Matcher m = p.matcher("abaabaaab");
		while(m.find()) {
			System.out.println("start index for match found : "+m.start());
			System.out.println("matching string : "+m.group());
		}
		

	}

}
