package org.tns.thread;

public class ExtendThread extends Thread{
	
	public void run() {
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendThread t1 = new ExtendThread();
		t1.start();
	}

}
