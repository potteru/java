package maths_programming;

import java.util.Scanner;

public class Emi_Calculator {

	public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Principle Amount: ");
		double PAmount = scan.nextDouble();
		
		System.out.println("Enter the Rate of Intrest: ");
		Double roi = scan.nextDouble();
		
		System.out.println("Enter the Timeperiod: ");
		double timeperiod = scan.nextDouble();
	
		System.out.println("Enter the number of months: ");
		int months = scan.nextInt();
		
		emi_calculator(PAmount,roi,timeperiod,months);
		
	}

	public static void emi_calculator(double PAmount,double roi,double tPeriod,int months) {
		
		//int i = months;
		double simple_Intrest = (PAmount*roi*tPeriod)/100;
		for(int i = months; i <= 60; i++) {
			double emi = simple_Intrest/months;
		}
		//System.out.println("EMI per month is : "+emi);
	}
}
