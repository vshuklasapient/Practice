package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//[abc]=either a or b or c
		//[^abc]except a and b and c
		//[a-z]any lower case
		//[A-Z]any upper case
		//[a-zA-Z]any alphabet
		//[0-9]any digit
		//[0-9a-zA-Z]any alphanumeric characters
		//[^0-9a-zA-Z]except alphanumeric characters
		Pattern p = Pattern.compile("[abc]");
		Matcher m = p.matcher("a3b#k@9z");
		while(m.find()) {
			System.out.println("MAtch found!");
			System.out.println("Start index : "+m.start());
			System.out.println("MAtched string: "+m.group());
		}
	}

}
