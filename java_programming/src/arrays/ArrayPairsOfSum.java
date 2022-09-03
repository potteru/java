package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayPairsOfSum {
	
	public static int[] twoSumBruteForce(int[] array,int target) {
		// 5,6,4,5,3,2,1
		for(int i=0;i< array.length;i++) {
			for(int j = i+1;j<array.length;j++) {
				if(array[j] == (target - array[i])) {
					return new int[] {i,j};
				}
			}
		}
		throw new IllegalArgumentException("No pair is found ");
	}
	
	public static int[] twoSum(int[] array,int target) {
		
		Map<Integer,Integer> numMap = new HashMap<>();
		for(int i=0;i<array.length;i++) {
			numMap.put(array[i], i);
		}
		for(int i=0;i<array.length;i++) {
			int numToFind = target-array[i];
			
			if(numMap.containsKey(numToFind) && numMap.get(numToFind) != i) {
				return  new int[] {i, numMap.get(numToFind)};
			}
		}
		throw new IllegalArgumentException("No pair is found ");
	
	}
	
	
	public static void main(String[] args) {
		int[] array = {5,6,4,5,3,2,1};
		int target = 10;
		
		System.out.println("Using BruteForce: "+ Arrays.toString(twoSumBruteForce(array,target)));
		System.out.println();
		
		System.out.println("Using HashMAp: "+ Arrays.toString(twoSum(array,target)));
		
	}

}
