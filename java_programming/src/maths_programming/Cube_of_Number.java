package maths_programming;

import java.util.Scanner;

public class Cube_of_Number {

	public static void main(String[] args) {

		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Enter the number to find CUBE of number: ");
		int number = scan.nextInt();
		
		cube(number);
	}

	public static void cube(int number) {
		System.out.println("The cube of a number: "+number+ " is: "+(number*number*number));
	}
}
