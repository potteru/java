package java_basic_programs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entere The Number To Find Armstrong Number or Not: ");
		int num = scan.nextInt();
		
		int original_num = num;
		int sum = 0;
		
		for(int i = original_num; i > 0  ; i = i/10) {
			int rem = i % 10;
			sum = sum +(rem*rem*rem);
		}
		
		if(sum == original_num) {
			System.out.println("Given number is Armstrong Number: "+sum);
		}
		else {
			System.out.println("Given Number is not Armstrong Number!!!: "+ num);
		}
		
	}

}
