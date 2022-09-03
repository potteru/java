package java_basic_programs;

public class MissingNumberInArray {

	public static void main(String[] args) {

		//Array should not have duplicates
		//Array no needs to be sorted order
		//values should be in range
		
		int a[] = {1,2,3,4,5,6,8,9,10};
		
		//1+2+4+5 = 12
		//1+2+3+4+5 = 15
		//sum2 - sum1 = 3 this is the missing number
		
		int sum1 = 0;
		for(int i = 0; i <= a.length-1; i++) {
			sum1 = sum1 + a[i];
		}
		System.out.println("Sum of Elements in Array: "+ sum1);
		
		int sum2 = 0;
		for(int i = 1; i <= 10; i++) {
			sum2 = sum2 +  i;
		}
		
		System.out.println("Sum of Range of Elements: "+ sum2);
		System.out.println("Missing Number is: "+(sum2-sum1));
		
	}

}
