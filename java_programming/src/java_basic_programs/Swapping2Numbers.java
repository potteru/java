package java_basic_programs;

public class Swapping2Numbers {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		
		int temp;
		System.out.println("Before swapping: a= " +a+" b= "+b);
		
		// with temp variable
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("\n"+"In Logic 1 swapping: a= " +a+" b= "+b);
		
		// using + & - operators without temp variable
		
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("\n"+"In Logic 2 swapping: a= " +a+" b= "+b);
		
		// using * & / operators
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("\n"+"In Logic 3 swapping: a= " +a+" b= "+b);
		
		// using bit wise XOR(^) operator 
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("\n"+"In Logic 4 swapping: a= " +a+" b= "+b);
		
		// with single statement
		b= a + b - (a=b);
		System.out.println("\n"+"In Logic 5 swapping: a= " +a+" b= "+b);
		
	}

}
