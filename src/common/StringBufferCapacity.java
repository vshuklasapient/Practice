package common;

public class StringBufferCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//length is current occupied where capacity is ability to accomodate
		//Constructor 1
		StringBuffer sb = new StringBuffer();//Capacity of default string buffer constructor: 16
		//if 16 crosses a new object is created with capacity : (cc+1)*2 i.e. (16+1)*2=34
		System.out.println("Capacity of default string buffer constructor:"+sb.capacity());
		
		//Contructor 2
		StringBuffer sb1 = new StringBuffer(10);//With capacity directly mentioned
		System.out.println("Capacity of Integer SB contructor:"+sb1.capacity());
		
		//Contructor 3
		StringBuffer sb2 = new StringBuffer("durga");//With String as argument
		System.out.println("Capacity of String SB constructor:"+sb2.capacity());//Length of string + default capacity i.e, 5+16=21
		
	}

}
