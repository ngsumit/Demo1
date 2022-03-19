package day15;

public class ThreadDemo7 extends Thread {
	
	public void run() {
		int n = 0;
		while(n < 5000) {
			System.out.println("Count below 5000");
		}
		
		{
			System.out.println("Count ");
			}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo7 td = new ThreadDemo7();
		Thread th1 = new Thread();
		Thread th2 = new Thread();
		th1.start();
	}

}
