package maths_programming;

import java.util.Scanner;

public class Number_Divisible_by_5_and_11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enteer the number to find Divisible by 5 and 11: ");
		int number = scan.nextInt();
		
		number_divisible_by5_and_11(number);
	}

	public static void number_divisible_by5_and_11(int number){
		
		if(number % 5 == 0 && number % 11 == 0) {
			System.out.println("The number Divisible by 5 and 11 is: "+number);
		}
		else {
			System.out.println("!! The number Entered is not Divisible by 5 and 11: !!"); 
			System.out.println("You Enetered number is : "+ number);
			System.out.println("Please Enter Another Number !");
		}
			
	}
}
