package day9;

class BankCustomer {

	private Integer balance = 2000;

	public synchronized void withdraw(Integer amount) {
		System.out.println("removing money.....");
		while (this.balance < amount) {
			System.out.println("Insufficient balance ...Please deposit money");
			try {
				System.out.println(" Before Wait : " + Thread.currentThread().getName());
				wait();
				System.out.println("After wait : " + Thread.currentThread().getName());

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		this.balance = this.balance - amount;
		System.out.println("Withdraw done...." + amount);

	}

	public synchronized void deposit(Integer amount) {
		System.out.println("Deposit amount.....");
		this.balance = this.balance + amount;
		System.out.println("Deposit amount done : " + this.balance);
		notifyAll();
	}
}

public class ThreadDemo6 {
	public static void main(String[] args) {
		BankCustomer bankCustomer = new BankCustomer();
		new Thread(() -> {
			bankCustomer.withdraw(5000);
		}, "nau").start();

		new Thread(() -> {
			bankCustomer.withdraw(4000);
		}, "sai").start();

		new Thread(() -> {
			bankCustomer.deposit(1000);
		}, "tejas").start();
		new Thread(() -> {
			bankCustomer.deposit(1000);
		}, "akh").start();
		new Thread(() -> {
			bankCustomer.deposit(1000);
		}, "rk").start();
		new Thread(() -> {
			bankCustomer.deposit(1000);
		}, "r1k").start();
		new Thread(() -> {
			bankCustomer.deposit(1000);
		}, "rk2").start();
		new Thread(() -> {
			bankCustomer.deposit(1000);
		}, "rk3").start();
		new Thread(() -> {
			bankCustomer.deposit(1000);
		}, "rk4").start();
		

	}
}
