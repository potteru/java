package arrays;

/*
 * Insertion sort:
 * Unsorted array: [5,6,1,3,4,2,9,4]
 * How we can sort an unsorted array using java
 * 
 * 1) traversing  an array from left to right
 * 2) take an items of an array and compare it to items on it's left
 * 3) insert it to it's correct position
 * 
 * 
 * 
 */
public class InsertionSort {
	
	public static void insertionSort(int[] array) {
		int temp,j;
		
		for(int i = 1; i< array.length; i++) {
			temp = array[i];
			j = i-1;
			
			while(j >=0 && temp < array[j]) {
				array[j+1] = array[j];
				j=j-1;
			}
			array[j+1] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] array = {5,3,2,5,6,9,8,8,7,7,9};
		insertionSort(array);
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

}
