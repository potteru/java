package java_basic_programs;

import java.util.Scanner;

public class LargestOf_3_numbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number:");
		int a = scan.nextInt();
		
		System.out.println("Enter Second Number:");
		int b = scan.nextInt();

		System.out.println("Enter Third Number:");
		int c = scan.nextInt();
		/*
		if(a>b && a>c) {
			System.out.println(a+" Is the Largest number");
		}else if(b>a && b>c){
			System.out.println(b+" Is the Largest number");
		}else {
			System.out.println(c+" Is the Largest number");
		}
		*/
	
	
		// Ternary operator
//		int largest = a>b? a:b;
//		int largest1 = c>largest?c:largest;
//		System.out.println(largest1+" Is largest number");
		
		int large = c>(a>b?a:b)?c:(a>b? a:b);
		System.out.println(large+" Is the largest number");
		
	}
}
