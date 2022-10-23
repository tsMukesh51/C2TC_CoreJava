package org.tns.exception;

public class MultiCatchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int arr[] = new int [6];
			arr[9] = 20/0;
			System.out.println("Im in try");
		}
		catch(ArrayIndexOutOfBoundsException aibe) {
			System.out.println("Accessing Index out of Range");
		}
		catch(ArithmeticException ae) {
			System.out.println("A number can not divided by zero");
		}
		
		System.out.print("Out");
	}

}
