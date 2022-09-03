package java_basic_programs;

import java.util.Scanner;

public class Even_Odd_Numbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number To find Even numbers and Odd Numbers: ");
		int num  = scan.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if(i % 2 ==0) {
				System.out.println("Even numbers: "+i);
			}
			else {
				System.out.println("Odd numbers: "+i);
			}
		}
	}

}
