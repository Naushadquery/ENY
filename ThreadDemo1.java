package day9;

public class ThreadDemo1 {
	public static void main(String[] args) {
		
		System.out.println("Start");
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("i : = " + i);
		}
		
		m1();// no pause
		for (int i = 1; i <= 5; i++) {
			System.out.println("k: = " + i);
		}
		
		System.out.println("End");
	}

	private static void m1() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("j : = " + i);
		}
	}
}
