package regularexpression;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileNameExtractor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\Gauri\\eclipse-workspace\\Practice");
		Pattern p = Pattern.compile("[a-zA-Z0-9_$]+[.]txt");
		String[] arrS= f.list();
		for(String s:arrS) {
			Matcher m = p.matcher(s);
			if(m.find() && m.group().equalsIgnoreCase(s)) {
				System.out.println("Found match : "+m.group());
			}
		}
	}

}
