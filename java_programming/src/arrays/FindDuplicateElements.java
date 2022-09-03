package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * find duplicate elements in an array 
 * 
 * arr = {4,3,2,4,5,6,5,6,7,8,6,7};
 * output: {4,5,6,7}
 * 
 * 1) Bruteforce approach time complexity : O(N^2)
 * 2) Using HashMap -
 * 		Time Complexity : O(N)
 * 		Space Complexity : O(N)
 * 3) Using Set - 
 * 		Time Complexity : O(N)
 * 		Space Complexity : O(N)
 * 
 */
public class FindDuplicateElements {
	
	public static void findDuplicates(int[] arr) {
		for(int i = 0; i<arr.length;i++) {
			for(int j=i+1;j< arr.length;j++) {
				if(arr[i] == arr[j]) {
					System.out.print(arr[j]+",");
				}
			}
		}
	}
	
	public static void findDuplicatesUsingMap(int[] array) {
		
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<array.length;i++) {
			if(map.containsKey(array[i])) {
				map.put(array[i], map.get(array[i])+1);
			}else {
				map.put(array[i], 1);
			}
		}
		map.forEach((k,v) -> {
			if(v > 1) {
				System.out.print(k+" ");
			}
		});
	}
	
	
	public static void findDuplicatesUsingSet(int[] array) {
		
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<array.length;i++) {
			if(set.contains(array[i])) {
				System.out.print(array[i]+" ");
			}else {
				set.add(array[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] array = {4,5,6,3,3,4,5,6,2,4,5,6,3,1,1};
		findDuplicates(array);
		System.out.println();
		
		findDuplicatesUsingMap(array);
		System.out.println();
		
		findDuplicatesUsingSet(array);
		
	}
}