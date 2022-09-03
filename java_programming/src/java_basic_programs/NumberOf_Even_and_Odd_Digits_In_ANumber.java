package java_basic_programs;

import java.util.Scanner;

public class NumberOf_Even_and_Odd_Digits_In_ANumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = scan.nextInt();
		
		int  even_count=0;
		int odd_count=0;
		int rem = 0;
		while(num!=0) {
			rem = num%10;
			if(rem % 2 == 0 ) {
				even_count++;
			}else {
				odd_count++;
			}
			num = num/10;
		}
		System.out.println(" Even Digits are: "+ even_count+"\n Odd Digits are: "+odd_count);
		
	}

}
