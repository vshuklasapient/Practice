package common;

public class StringBuilderMethodChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("durga").insert(5, "+").append("solutions").append("xyz").reverse().delete(0, 3).reverse();
		System.out.println(sb);

	}

}
