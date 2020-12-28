package regularexpression;

import java.util.StringTokenizer;

public class StringTokeniserEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("19-12-1987","-");
		while(st.hasMoreTokens()) {
			System.out.println("Splitted on basis of - : "+st.nextToken());
		}
	}

}
