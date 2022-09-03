package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*Remove duplicate elements from unsorted array
 * input: {9,8,6,3,4,4,5,5,7,8,1,2};
 * output: {1,2,3,4,5,7,8};
 * 
 * Method 1: Sort the array and remove the duplicate elements
 *  Unsorted input: {9,8,6,3,4,4,5,5,7,8,1,2};
 * sorted output: {1,2,3,4,4,5,5,6,7,8,8,9};
 * 
 * int j=0;
 * for(int i=0; i< arr.length-1;i++){
 * 	if(arr[i] != arr[i+]){
 * 		arr[j++] = arr[i];
 * 		}
 * }
 * last element in array
 * arr[j++] = arr[len-1]; 
 * 
 * Time complexity O(n log n)
 * -----------------------------------------------------------------------------
 * Method 2: Using HashMap (HashMap is used to storing key and value pairs)
 * 
 * Create a Map of array elements and it's count.Then traverse a map and print 
 * it's keys 
 * 
 * time complexity O(n)
 * ------------------------------------------------------------------------------
 * Method 3: Using Set (Set is a data structure which stores only a unique elements) 
 * 
 * 
 * 
 * 
 */

public class RemoveDuplicatesFromUnsortedArray {
	
	
	public static void removeDuplicatesUsingSorting(int[] arr){
		
		Arrays.sort(arr);
		
		int len = arr.length;
		int j=0;
		  for(int i=0; i< len-1;i++){
		  	if(arr[i] != arr[i+1]){
		  		arr[j++] = arr[i];
		  		}
		  }
		 // last element in array
		  arr[j++] = arr[len-1]; 
		  
		for(int k=0; k< j; k++) {
			System.out.print(arr[k]+" ");
		}
	}
	
	public static void removeDuplicatesUsingHashing(int[] array) {
		Map<Integer,Integer> map = new HashMap<>();
		int len = array.length;
		
		for(int i=0;i< len-1;i++) {
			if(map.containsKey(array[i])) {
				map.put(array[i],map.get(array[i]+1));
			}else {
				map.put(array[i],1);
			}
		}
		// print each key
		map.forEach((k,v) -> System.out.print(k+" "));
		
	}
	
	public static void removeDuplicatesUsingHashSet(int[] array){
		
		Set<Integer> set = new HashSet<Integer>();
		int len = array.length;
		
		for(int i=0;i<len-1;i++) {
			set.add(array[i]);
		}
		set.forEach(elements -> System.out.print(elements+" "));
	}
	
	public static void main(String[] args) {
		
		int[] array = {6,5,4,6,4,5,2,1,3,5,3,2,2,5,9,7,8,8,9,9};
		
		removeDuplicatesUsingSorting(array);
		System.out.println();
		
		removeDuplicatesUsingHashing(array);
		System.out.println();
		
		removeDuplicatesUsingHashSet(array);
		System.out.println();
	}

}