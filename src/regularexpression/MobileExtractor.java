package regularexpression;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileExtractor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			PrintWriter pw = new PrintWriter("output.txt");
		    BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		    Pattern p = Pattern.compile("[789]\\d{9}");
		    String line = br.readLine();
			while(line!=null) {
				Matcher m = p.matcher(line);
				while(m.find()) {
					System.out.println("Match found: "+m.group());
					pw.println(m.group());
				}
				line = br.readLine();
			}
			br.close();
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
