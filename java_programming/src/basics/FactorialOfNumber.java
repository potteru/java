package basics;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {

		 int i,fact=1; 
		 
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter A Number: ");
		 int number = scan.nextInt();
		 
		 // int number=5;//It is the number to calculate factorial    
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);
	}

}
