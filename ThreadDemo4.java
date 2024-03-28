package day9;

class Washroom implements Runnable {
	@Override
	public synchronized void run() {
		for (int i = 1; i <= 5; i++) {
		String name =Thread.currentThread().getName();
			System.out.println(name + ": i = " + i);
		}
	}
}

public class ThreadDemo4 {
	public static void main(String[] args) {
		System.out.println("Start");
		Washroom washroom = new Washroom();
		Thread naushad = new Thread(washroom,"naushad");
		naushad.setPriority(10);
		Thread rk = new Thread(washroom,"rk");
		rk.setPriority(1);
		Thread sasmal = new Thread(washroom,"sasmal");
		sasmal.setPriority(1);
		naushad.start();
		rk.start();
		sasmal.start();
		System.out.println("End");
		
	}

}
