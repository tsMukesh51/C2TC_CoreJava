package org.tns.thread;

public class SquareNum extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 0; i < 5; i++ ) {
			try {
				Thread.sleep(200);
				System.out.println("Square: " + (i*i));
			}
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
	}
			}


}
}