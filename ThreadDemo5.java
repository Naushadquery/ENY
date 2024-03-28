package day9;

public class ThreadDemo5 {
	public static void main(String[] args) {

		System.out.println("Start");

//		Runnable runnable = () -> {
//			for (int i = 0; i < 10; i++) {
//				System.out.println(i);
//			}
//		};

		new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("i :" + i);
			}
		}).start();
		
		new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("j :" + i);
			}
		}).start();
		
		System.out.println("End");
	}
}
