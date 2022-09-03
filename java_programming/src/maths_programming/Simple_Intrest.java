package maths_programming;

import java.util.Scanner;

public class Simple_Intrest {
	
	// Simple Interest = (Principal Amount * Rate of Interest * Number of years) / 100

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Principle Amount: ");
		double PAmount = scan.nextDouble();
		
		System.out.println("Enter the Rate of Intrest: ");
		Double roi = scan.nextDouble();
		
		System.out.println("Enter the Timeperiod: ");
		double timeperiod = scan.nextDouble();
		
		System.out.println("The Simple Intrest for the Entered Amount is: "+simple_Intrest(PAmount,roi,timeperiod));
	}

	public static double simple_Intrest(double PAmount,double roi,double timeperiod) {
		
		double simple_Intrest = (PAmount*roi*timeperiod)/100;
		return simple_Intrest;
	}
}
