package java_8_newFeatures;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateBiFunctionDemo {

	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> checksumofTwo = (a,b) -> a+b >= 5;
		System.out.println("sum of 5 and 6 is greater than 5 : " + checksumofTwo.test(5, 6));
		System.out.println("sum of 1 and 3 is greater than 5 : "+checksumofTwo.test(1, 3));
		
		BiFunction<Integer, Integer, Integer> multiplayBoth = (a,b) -> a*b;
		System.out.println("Multiplication of 2 and 5 is : "+ multiplayBoth.apply(2, 5));
		System.out.println("Multiplication of 1 and 5 is : "+ multiplayBoth.apply(1, 5));
	
	}
	
}
