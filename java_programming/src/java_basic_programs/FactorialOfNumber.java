package java_basic_programs;

public class FactorialOfNumber {

	public static void main(String[] args) {

		int num = 5;
		
		long fact = 1;
		/*
		for(int i =1; i<=num;i++) {
			fact = fact*i;
		}
		*/
		
		for(int i = num; i >= 1 ; i--) {
			fact = fact * i;
		}
		System.out.println("Factorial of a number: "+fact);
	}

}
