package java_basic_programs;

// Natural number > 1
// Which has only 2 factors 1 and itself

// 19 => 1 and 19 -> is a prime number
// 28 => 1,2,4,6,7,14,28 -> Is not a prime number

public class PrimeNumber_orNot {

	public static void main(String[] args) {

		int num = 25;
		int count = 0;

		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			System.out.println("ount is "+count);
			if (count == 2) {
				System.out.println(num+" Is a Prime Number");
			} else {
				System.out.println(num+" Is Not a Prime Number");
			}
		} 
		else {
			System.out.println(num+" Is Not a Prime Number");
		}

	}

}
