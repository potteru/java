package java_basic_programs;

import java.util.Scanner;

public class Armstrong_Numbers {

	public static void main(String[] args) {

		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter the Range to find ArmStrong Numbers: ");
		int num = scan.nextInt();
		
		int rem = 1;
		int sum = 0;
		for(int i= 1; i <= num; i++) {
			for(int j = i; j >0 ; j = j/10) {
				rem = j %10;
				sum = sum + (rem*rem*rem);
			}	
				if(i == sum) {
					System.out.println("Armstrong Number: "+i);
				}
				else {
					System.out.println("No Armstrong Numbers found in the range!!");
				}
			
		}
	}
}
