package com.nau;

public class DataTypeDemo {

	public static void main(String[] args) {
	
		byte a = 1;   // 1 byte  -  signed // 256 = +127, -128
		System.out.println(Byte.MAX_VALUE + " " + Byte.MIN_VALUE); // Wrapper Classes
		short b = 2; // 2 byte - signed // 65536 =  -
		System.out.println(Short.MAX_VALUE + " " + Short.MIN_VALUE);
		int c = 12;  // 4 byte - signed // 246
		System.out.println(Integer.MAX_VALUE + " " + Integer.MIN_VALUE);
		long d = 3;  //  8 byte - signed // 
		System.out.println(Long.MAX_VALUE + " " + Long.MIN_VALUE);

		
		float e = 12.34F;  // 4 bytes
		System.out.println(Float.MAX_VALUE + " " + Float.MIN_VALUE);
		double f = 344.343; // 8 bytes
		System.out.println(Double.MAX_VALUE + " " + Double.MIN_VALUE);
		
		char g = 'A'; // 2 bytes // internationalization
		System.out.println(Character.SIZE);
		
		boolean h = true; // literal true/false
		System.out.println(Boolean.compare(true, true));

	}

}
