package java_basic_programs;

import java.util.Scanner;

public class SumOf_Digits_InaNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number to find Sum:");
		
		int num = scan.nextInt(); //1234
		int sum = 0;
		while(num > 0) {
			sum = sum + num%10; //4+3+2	
			num = num/10; // 123	12	1	0	
		}
		System.out.println("The Sum of all Digits: "+sum);
	}

}
