package com.nau;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import com.abc.A;

class B implements A {

	@Override
	public void abc() {
		// TODO Auto-generated method stub
	}
}

public class StreamsDemo2 {

	public static void main(String[] args) throws IOException {
		// InputStream , OutputStream
		try (FileInputStream fis = new FileInputStream("abc.txt");
				FileOutputStream fos = new FileOutputStream("xyz.txt");)
//				InputStream is = System.in;) 
		{
			int x = 0;
			while ((x = fis.read()) != -1) {
				fos.write(x);
			}
		}
		// Reader and Writer
		try (FileReader fileReader = new FileReader("abc.txt"); FileWriter fileWriter = new FileWriter("xyz1.txt")) {
			int x = 0;
			while ((x = fileReader.read()) != -1) {
				fileWriter.write(x);
			}
		}
	}
}
