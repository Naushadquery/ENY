package day9;

class MyThread implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("i : = " + i);
		}

	}
}

public class ThreadDemo3 {
	public static void main(String[] args) {

		System.out.println("Start");

		for (int i = 1; i <= 10; i++) {
			System.out.println("i : = " + i);
		}

		m1();
		MyThread myThread = new MyThread();
		Thread t1 = new Thread(myThread);
		t1.setName("Naushad");
		t1.start();
		Thread t2 = new Thread(myThread, "Akhtar");
		t2.start();
//		Thread t3 = new Thread(myThread);
//		t3.start();
		System.out.println("End");
		// ...........
	}

	private static void m1() {

		m2();
	}

	private static void m2() {

	}
}
