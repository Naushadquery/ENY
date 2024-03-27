package com.nau;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamsDemo1 {

	public static void main(String[] args) throws IOException {

		System.out.println("Hello");
	
		String name = "Naushad Akhtar";
	//	System.out.println(name);
//		

		InputStream is = System.in;
		int x = 0;
		while ((x = is.read()) != 13) {
			System.out.print((char)x);
		}

		OutputStream os= System.out;
		for(int i = 0; i<name.length() ;i++) {
			char c = name.charAt(i);
			os.write(c);
		}
		os.close();

	}
}
