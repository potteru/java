package java_basic_programs;

import java.util.Arrays;

public class BubleSort {

	public static void main(String[] args) {

		int a[] = {4,3,2,1,5};
		
		System.out.println("Array Before Sorting "+Arrays.toString(a));
		int n = a.length;
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j< n-1; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		System.out.println("Array After sorting "+Arrays.toString(a));
	}

}
