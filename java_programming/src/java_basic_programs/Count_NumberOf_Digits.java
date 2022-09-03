package java_basic_programs;

import java.util.Scanner;

public class Count_NumberOf_Digits {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number to Count Digits: ");
		
		int num = scan.nextInt();
		int count = 0;
		while( num > 0 ) {
			num = num/10;
			count++;
		}
		System.out.println("Number of Digits are: "+count);
	}

}
