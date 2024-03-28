package day9;

class MyPrinter extends  Thread{
	private int num;
	public MyPrinter(int num) {
		this.num = num;
	}
	@Override
	public void run() {
		for (int i = 1; i <= num; i++) {
			System.out.println("k: = " + i);
		}
	}
	public void print() {
		start();
	}
}


public class ThreadDemo2 {
	public static void main(String[] args) {
		
		System.out.println("Start");
		
		MyPrinter printer = new MyPrinter(20);
		printer.print();
		
		MyPrinter printer1 = new MyPrinter(30);
		printer1.print();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("i : = " + i);
		}
		System.out.println("End");
		//...........
	}
}
