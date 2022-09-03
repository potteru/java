package java_basic_programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to reverse: ");
		int num = scan.nextInt();
		
		//1. Using algoritham
//		int rev = 0;
//		
//		while(num!=0) {
//			rev = rev * 10 + num % 10; // (0*10 + 1234%10) = 4   // (4*10)+123%10 = 43 // 43*10+12%10 = 432 // 432*10+1%10 = 4321
//			num = num / 10; //(1234/10) = 123  // (123/10) = 12 // (12/10) = 1 // (1/10)=0
//		}
//		System.out.println("in Logic 1 After reversing the number: "+rev);
		
		//2. Using String buffer method
		
//		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		StringBuffer rev = sb.reverse();
//		System.out.println("Reversed Number is: "+rev);
//		
		//3. Using StringBuilder method
		StringBuilder sb1 = new StringBuilder();
		sb1.append(num);
		StringBuilder reverse = sb1.reverse();
		System.out.println("Reversed number: "+reverse);
	
	}

}
