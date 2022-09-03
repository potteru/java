package java_basic_programs;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		
		int original_Num = num;
		int rev=0;
		while(num!=0) {
			rev = rev*10 + num%10;
			num = num / 10;
		}
		if(original_Num == rev) {
			System.out.println("Entered Number is Palindrome number: "+original_Num);
		}else {
			System.out.println("Entered Number is not Palindrome!!!");
		}
	}

}
