package org.tns.programs;

import java.util.Random;
import java.util.Scanner;

class Account {
	
	String name;
	int balanc;
	long accNum;
	Account(String name) {
		this.name = name;
		balanc = 0;
		accNum = getAccNum();
		System.out.println("Account Created Successfully");
		displayDetails();
	}
	
	void displayDetails() {
		System.out.println("AC No.: " + accNum + "\nName: " + name + "\nBalance:" + balanc);
		
	}

	void deposit(int amount) {
		balanc = balanc + amount;
		System.out.println("The total balance of your account: " + balanc);
	}
	
	void withDraw(int amount) {
		if(balanc < amount) {
			System.out.println("Insufficient Balance. Can't with draw amount.");
		}
		else {
			balanc = balanc - amount;
		}
		System.out.println("The final balance of your account: " + balanc);
		
	}

	long getAccNum() {
		int[] acNum = new int[100];
		outer:
		while(true) {
	      long num = (long)((Math.random() * 899999) + 100000);
	      for(int i = 0; i < acNum.length; i++) {
	    	  if(acNum[i] == num) {
	    		  continue outer;
	    	  }
	      }
	      return num;
		}
	}
}

public class Bank {

	public static void main(String[] args) {
		System.out.println("Namaste, Welcome to Banking");
		Scanner sc = new Scanner(System.in);
		int obNum = 0;
		int loginId = -1;
		Account [] acc = new Account [100];
		while(true) {
			System.out.println("1) Create Account\n2) Login Account");
			int choice = Integer.parseInt(sc.nextLine());
			if(choice == 1) {
				System.out.println("Enter Name:");
				String name = sc.nextLine();
				acc[obNum] = new Account(name);
				obNum++;
			}
			else if(choice == 2) {
				System.out.println("Type your account number");
				long accNum = Integer.parseInt(sc.nextLine());
				for(int i = 0; i < obNum; i++) {
					if(accNum == acc[i].accNum) {
						loginId = i;
						System.out.println("Login Successful");
						break;
					}
				}
				while(true) {
					if(loginId == -1) {
						System.out.println("Account not found");
						break;
					}
					System.out.println("1) View Account Details\n2) Deposite to Account\n3) Withdraw from Account\n4) Exit");
					choice = Integer.parseInt(sc.nextLine());
					if(choice == 1) {
						acc[loginId].displayDetails();
					}
					else if(choice == 2) {
						System.out.println("Enter the amount to deposit:");
						int amount = Integer.parseInt(sc.nextLine());
						acc[loginId].deposit(amount);
					}
					else if(choice == 3) {
						System.out.println("Enter the amount to with draw:");
						int amount = Integer.parseInt(sc.nextLine());
						acc[loginId].withDraw(amount);
					}
					else if(choice == 4) {
						loginId = -1;
						break;
					}
				}
			}
		}
	}
}

