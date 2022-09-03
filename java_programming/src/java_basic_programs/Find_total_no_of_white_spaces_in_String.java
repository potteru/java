package java_basic_programs;

import java.util.Scanner;

public class Find_total_no_of_white_spaces_in_String {

	public static void main(String[] args) {

	//	Scanner scan = new Scanner(System.in);
	//	System.out.println("Enter String to find total white spaces: ");
		
		String line ="abc a s d r e t y ";
		
		int count = 0;
		for(int i = 0; i <= line.length()-1; i++ ) {
			char str1 = line.charAt(i);
			if (str1 == ' ')
			{
				count++;
			}
		}
		System.out.println("Number of white spaces: "+count);
	}
}


