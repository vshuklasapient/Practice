package java8;

import java.util.Arrays;
import java.util.List;

public class stream_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lst = Arrays.asList(9,10,12,15,16,5,6);
		int sum = lst.stream().filter(i->i>10).mapToInt(i->i).sum();//Sum of all greater than 10
		System.out.println("Sum using stream api : "+sum);
		lst.forEach(i->{
			System.out.println("Value of i using for each loop:"+i);
		});
		lst.forEach(System.out::println);//Method reference
		
	}

}
