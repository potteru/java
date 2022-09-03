package maths_programming;

import java.util.Scanner;

public class Compound_Intrest {

	/*
	Future CI = Principal Amount * ( 1 + Rate of Interest )Number of years)

	The above formula is to calculate Future because it contains both the 
	Principal Amount and CI. To get the Compound Interest, use the below formula:

	CI = Future CI – Principal Amount
	*/
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		
		double PAmount, ROI, TimePeriod;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the Principal Amount : ");
		PAmount = sc.nextDouble();
		
		System.out.print(" Please Enter the ROI : ");
		ROI = sc.nextDouble();
		
		System.out.print(" Please Enter the Time Period in Years : ");
		TimePeriod = sc.nextDouble();
		
		compound_Intrest(PAmount, ROI, TimePeriod);
		

		//double CI= compound_Intrest(50000.0,8.5,7.0);
		//System.out.println("The Compound Intrest is: "+CI);
	}
	
	public static void compound_Intrest(double PAmount,double ROI,double TimePeriod) {
		
		double FutureCI;
		double CI;
		FutureCI = PAmount * Math.pow(1+(ROI/100), TimePeriod);
		CI = FutureCI - PAmount;
		
		System.out.println("\n Future for " + PAmount + " is = " + FutureCI);
		System.out.println(" Actual for " + PAmount + " is = " + CI);
		
	}

}
