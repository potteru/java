package java_basic_programs;

import java.util.Arrays;

public class SortingElements {

	public static void main(String[] args) {

		//Approach - 1
		int a[] = {30,40,20,10,60};
		System.out.println("Array Before Sorting :"+Arrays.toString(a));
		
		Arrays.parallelSort(a);
		System.out.println("Array After Sorting : "+Arrays.toString(a));
		
		//Approach - 2
		int b[] = {70,40,30,50,80};
		System.out.println("Array Before Sorting: "+Arrays.toString(b));
		Arrays.sort(b);
		System.out.println("Array After Sorting: "+Arrays.toString(b));
		

	}

}
