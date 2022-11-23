package org.tns.programs;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		String result = "";
		if((num%5)==0) {
			result = "Fizz";
		}
		if((num%3)==0) {
			result += "Buzz";
		}
		if(result=="") {
			result = Integer.toString(num);
		}
		System.out.print(result);
	}

}
