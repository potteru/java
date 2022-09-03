package java_8_newFeatures;

import java.util.function.Predicate;

public class PredicateFunctionDemo {

	public static void main(String[] args) {

		PredicateFunctionDemo predicateFunDemo = new PredicateFunctionDemo();
		System.out.println(predicateFunDemo.testStringLength("Hello Bharath"));
		
		// Using predicate function 
		Predicate<String> checkstrLength = s -> s.length() >=5;
		System.out.println("Length of the string greater than 5 ?: "+checkstrLength.test("Hello India"));
		
	}
	
	public boolean testStringLength(String s) {
		if(s.length() >= 5) {
			return true;
		}
		else {
			return false;
		}
	}

}
