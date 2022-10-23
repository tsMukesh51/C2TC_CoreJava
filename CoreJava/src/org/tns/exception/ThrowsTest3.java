package org.tns.exception;

import java.io.IOException;

public class ThrowsTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			display();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
		}
		
	}
	static void display() throws IOException{
		System.out.println("Java");
		throw new IOException();
	}
}
