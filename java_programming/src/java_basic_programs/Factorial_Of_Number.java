package java_basic_programs;

import java.util.Scanner;

public class Factorial_Of_Number {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number to find factorial: ");
		int num = scan.nextInt();
		
		int fact = 1;
		for(int i=1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of a number: "+fact);
	}

}
