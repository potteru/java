package maths_programming;

import java.util.Scanner;

public class Even_1_Numbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter any number to Print Even numbers: ");
		int num = scan.nextInt();

		even_numbers(num);

	}

	public static void even_numbers(int number) {
		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				System.out.print(i+" ");
				
			} 
		}
	}

}
