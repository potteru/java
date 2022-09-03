package maths_programming;

import java.util.Scanner;

public class Largest_of_Two_numbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int n1 = scan.nextInt();
		
		System.out.println("Enter first number: ");
		int n2 = scan.nextInt();
		
		System.out.println("The largest of two numbers is: "+largest_of_two_numbers(n1,n2));
		
	}
	
	public static int largest_of_two_numbers(int n1,int n2) {
		
		if(n1 > n2) {
			return n1;
		}else {
			return n2;
		}
	}

}
