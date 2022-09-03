package java_basic_programs;

public class MaxAndMinElementsInArray {

	public static void main(String[] args) {

		int a[] = {50,30,40,20,60};
		// Finding Max value
		int max = a[0];
		
		for(int i = 0; i <= a.length-1; i++) {
			if(a[i] > max) {
				max = a[i]; 
			}
		}
		System.out.println("Maximum Element in the Array is: "+ max);
		//Finding Min value
		int min = a[0];
		for(int i =0 ; i <= a.length-1;i++) {
			if(a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Minimun value in the Array is: "+ min);
	}

}
