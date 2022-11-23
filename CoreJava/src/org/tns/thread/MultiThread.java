package org.tns.thread;

public class MultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquareNum sq = new SquareNum();
		DoubleNum db = new DoubleNum();
		System.out.println("Staring");
		sq.start();
		db.start();
		}
	}
