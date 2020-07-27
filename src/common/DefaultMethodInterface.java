package common;

public interface DefaultMethodInterface {
	void m1();
	void m2();
	default void defaultMethod() {
		System.out.println("Default method allowed Java 8 onwards");
	}
}

class Test1 implements DefaultMethodInterface{
	
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.defaultMethod();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
}
class Test2 implements DefaultMethodInterface{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
}
class Test3 implements DefaultMethodInterface{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
}
class Test4 implements DefaultMethodInterface{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
}
