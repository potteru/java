package java_basic_programs;

public class SumOfElementsInArray {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5,6,7,8,9};
		int sum = 0;
		/*
		for(int i = 0; i <= a.length-1; i++) {
			sum = sum + a[i];
		}
		*/
		
		// Enhanced for loop
		for(int value : a) {
			sum = sum + value;
		}
		
		System.out.println("Sum of Array Elements: "+sum);
	}

}
