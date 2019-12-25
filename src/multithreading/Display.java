package multithreading;

public class Display {
	
	synchronized public void wish(String sName) {
		for(int i=0;i<=10;i++){
			System.out.print("Good Morning :");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {}
			System.out.println(sName);
			
		}
	}

}

class MyThread extends Thread{
	Display d;String name;
	MyThread(Display d, String name){
		this.d=d;
		this.name=name;
	}
	public void run() {
		d.wish(name);
	}
}