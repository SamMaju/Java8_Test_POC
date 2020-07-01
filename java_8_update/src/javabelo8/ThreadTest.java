package javabelo8;


class MyRunnable implements Runnable{
	
	public void run() {
		for (int i=0;i<10;i++) {
			System.out.println("Child Thread: "+i);
		}
	}
}
public class ThreadTest {

	public static void main(String[] args) {
		Runnable r = new MyRunnable();
		Thread t1= new Thread(r);
		t1.start();
		for (int i=0;i<10;i++) {
			System.out.println("Main Thread: "+i);
		}
		
	}

}
