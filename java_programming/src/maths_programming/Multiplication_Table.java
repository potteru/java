package maths_programming;

import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("Enter Number to Multiplication table: ");
		int num = scn.nextInt();
		try {
			multiplication_Table(num);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void multiplication_Table(int num) throws InterruptedException {
		
		for(int i = 1; i <=10;i++) {
			System.out.println(num +"*"+i+"="+num*i);
			Thread.sleep(2000);
		}
	}
}
