package org.tns.exception;

public class ThrowTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =1;
		for(num=1; num <= 10; num++) {
			try {
				if(num==5)
					throw new Exception("Arithmetic");
				else if(num < 2)
					throw new RuntimeException("RuntimeEx");
				else if(num > 9)
					throw new NullPointerException("NullPointer");
			}
			catch(Exception z) {
				System.out.println("Caught");
				System.out.println(z.getMessage());
			}
		}

	}

}
