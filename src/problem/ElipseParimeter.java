package problem;

public class ElipseParimeter {
	static double pr;
	static double Perimeter(double a, double b) {
		pr=2*3.14*(Math.sqrt((a*a+b*b)/2));
		return pr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3,b=2;
		System.out.print("Perimeter of Eclipse having major and minor axis "+a+","+b+" respectively ="+Perimeter(a,b));
	}

}
