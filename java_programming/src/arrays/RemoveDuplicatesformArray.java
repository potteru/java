package arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesformArray {
	
	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,2,4,3,7,8,7,6,9};
		
		removeDuplicates(arr);
	}
	public static void removeDuplicates(int[] array) {
		Set<Integer> uniqueNumbers = new HashSet<>();
		boolean isDuplicatesExist = false;
		
		for(int i=0; i< array.length;i++) {
			if(uniqueNumbers.contains(array[i])) {
				isDuplicatesExist = true;
				System.out.println("Duplicate Elements are"+array[i]);
			}else {
				uniqueNumbers.add(array[i]);
			}
		}
		if(!isDuplicatesExist) {
			System.out.println(-1);
		}
	}

}
