package common;

public interface StaticMethodMAinInterface {//Java 1.8 on wards we can declare static method
	//in interface including main method and can be called in implementing using InterfaceNAme.methodName();
	public static void main(String[] args) {
		System.out.println("Main method inside interface");
	}
}
