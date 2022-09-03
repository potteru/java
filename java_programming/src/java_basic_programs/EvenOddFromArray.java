package java_basic_programs;

public class EvenOddFromArray {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5,6};
		// Extracting Even numbers...
		System.out.println("Even numbers .......");
		for(int i = 0; i <= a.length-1; i++) {
			if(a[i]%2 == 0) {
				System.out.print(a[i]+" ");
			}
		}
		
		System.out.println();
		System.out.println("Odd numbers .......");
		for(int i = 0; i <= a.length-1; i++) {
			if(a[i]%2 != 0) {
				System.out.print(a[i]+" ");
			}
		}
		
		System.out.println();
		// Using Enhanced for loop
		System.out.println("Enhanced loop Even Numbers ");
		for(int value : a) {
			if(value % 2 == 0) {
				System.out.print(value+" ");
			}
		}
		
		System.out.println();
		System.out.println("Enhanced loop Odd Numbers ");
		for(int value : a) {
			if(value % 2 != 0) {
				System.out.print(value+" ");
			}
		}
		
	}

}
