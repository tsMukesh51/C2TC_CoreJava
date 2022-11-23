package org.tns.thread;

public class ImplementRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Second way of Creating Thread");
		
	}
	
	public static void main(String[] args) {
		ImplementRunnable irOb = new ImplementRunnable();
		Thread thOb = new Thread(irOb);
//		irOb.start();
	}


}
