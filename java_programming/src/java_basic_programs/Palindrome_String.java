package java_basic_programs;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The String:  ");
		String str = scan.next();
		String original_str = str;
		
		String rev = "";
		int length = str.length();
		for(int i = length-1; i >= 0;i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		if(original_str.equals(rev)) {
			System.out.println("Entered string is Palindrome String: "+original_str);
		}
		else {
			System.out.println("Entered String is not Palindrome String!!!");
		}
	}

}
