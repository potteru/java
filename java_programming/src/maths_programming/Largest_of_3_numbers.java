package maths_programming;

import java.util.Scanner;

public class Largest_of_3_numbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int n1 = scan.nextInt();
		
		System.out.println("Enter second number: ");
		int n2 = scan.nextInt();
		
		System.out.println("Enter third number: ");
		int n3 = scan.nextInt();
		
		System.out.println(largest_of_3_numbers(n1,n2,n3));
		
	}
	
	public static int largest_of_3_numbers(int n1,int n2,int n3) {
		
		if(n1 > n2 && n1 > n3) {
			return n1;
		}else if(n2 > n3 && n2 > n1) {
			return n2;
		}else if(n3 > n1 && n3 > n2){
			return n3;
		}
		return 0;
	}

}
