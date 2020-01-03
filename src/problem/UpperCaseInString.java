package problem;

public class UpperCaseInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String orginalString = "AisaKaife";
		String isUp="";
		for(int x=0;x<orginalString.length();x++) {
			if(Character.isUpperCase(orginalString.charAt(x))) {
				isUp=isUp+" "+orginalString.charAt(x);
			}
		}
		System.out.println("Upper Case Character/s in given string "+orginalString+": "+isUp);
	}

}
