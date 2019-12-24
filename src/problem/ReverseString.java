package problem;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strExist = "Vaibhav";
		String strReverse = "";
		String [] arrStr = strExist.split("");
		int intArraySize = arrStr.length;
		for(int i = intArraySize-1;i>=0;i--) {
			strReverse = strReverse+arrStr[i];
		}
		System.out.println("Reverse string for "+strExist+ " == "+strReverse);
	}

}
