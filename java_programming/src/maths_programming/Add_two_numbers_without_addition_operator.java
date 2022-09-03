package maths_programming;

public class Add_two_numbers_without_addition_operator {

	public static void main(String[] args) {

		System.out.println(sum(1000,1900));
	}

	public static int sum(int a,int b) {
		while(b !=0) {
			
			int carry = a & b;
			a = a ^ b;
			b = carry << 1;
		}
		return a;
	}
}
