package regularexpression;

import java.util.regex.Pattern;

public class PatternSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("\\s");
		String[] arrStr = p.split("Durga software solution");
		for(String s:arrStr) {
			System.out.println("Splitted string: "+s);
		}
	}

}
