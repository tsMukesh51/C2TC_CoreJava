package org.tns.exception;

import java.util.Scanner;

public class UserAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Name");
		String userName = sc.nextLine();
		while(true) {
			try {
				System.out.println("Enter password");
				String password = sc.nextLine();
				validPassword(password);
				System.out.println("Successfully Created");
				break;
			}
			catch(Exception e) {
				System.out.println("Enter password with given requirements");
				continue;
			}
		}

	}

	private static void validPassword(String password) throws Exception {
		// TODO Auto-generated method stub
		String spChar = "`!@#$%^&*()_-+={[}]|\\:;\"'<,>.?/";
		int upcs = 0, lwcs = 0, spcs = 0;
		for(int i = 0; i < 6; i++) {
			char alp = password.charAt(i);
			if(alp >= 'A' && alp <= 'Z') {
				upcs++;
			}
			else if(alp >= 'a' && alp <= 'z') {
				lwcs++;
			}
			else if(spChar.contains(Character.toString(alp))) {
				spcs++;
			}
			System.out.println(i);
		}
		if((upcs == 3) && (lwcs == 2) && (spcs == 1)) {
			return;
		}
		else {
			throw new Exception("Password Invalid");
		}
	}

}
