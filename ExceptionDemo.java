package com.nau;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ExceptionDemo {

	public static void main(String[] args) {

		System.out.println("start main");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		tp();
		System.out.println("End Main");
	}

	public static void tp() {
		System.out.println("In tp method");
		int num[] = {1,3,5,0,6,2};
		for (int i = 0; i<num.length; i++) {
			System.out.println("tp : " + num[i]);
			System.out.println(10/num[i]);
		}
		tp1();
		System.out.println("End of tp method");
	}
	public static void tp1() {
		System.out.println("In tp1 method");
		for (int i = 0; i < 5; i++) {
			System.out.println("tp1 : " + i);
		}
		System.out.println("End of tp1 method");
	}
}
