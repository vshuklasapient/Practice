package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strTarget = "abbabba";int count=0;
		Pattern p = Pattern.compile("ab");
		Matcher m =p.matcher(strTarget);
		while(m.find()) {
			System.out.println("Start index for match : "+m.start());
			System.out.println("End index for match : "+m.end());
			System.out.println("MAtched string : "+m.group());
			count++;
		}
		System.out.println("Total occurance of ab : "+count);
	}

}
