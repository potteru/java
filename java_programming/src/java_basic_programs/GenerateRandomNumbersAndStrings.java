package java_basic_programs;

import java.util.Random;



public class GenerateRandomNumbersAndStrings {

	public static void main(String[] args) {

		// Approach 1
		Random rand = new Random();
		int randomInt = rand.nextInt(10000);
		System.out.println(randomInt);
		
		double randDouble = rand.nextDouble(); // range 0.0 to 1.0
		System.out.println(randDouble);
		
		// Approach 2
		System.out.println(Math.random());
		
		//Approach 3 - Apache commons - lang Api
		
		
		
		
		
	}

}
