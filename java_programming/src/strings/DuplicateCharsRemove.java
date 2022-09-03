package strings;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateCharsRemove {
	public static void main(String[] args) {
		System.out.println(findDuplicatesUsingFor("aaddimurthyimurthy"));// time complexity = O(N2)
		
		System.out.println(findDuplicatesUsingArray("aaddimurthyimurthy"));
		
		System.out.println(findDuplicatesUsingMap("aaddimurthyimurthy"));
	}
	
	public static Set<Character> findDuplicatesUsingMap(String name) {
		Set<Character> duplicates = new LinkedHashSet<>();
		
		HashMap<Character,Integer> countMap = new HashMap<Character,Integer>(); 
		
		for(int i=0; i< name.length();i++) {
			if(countMap.containsKey(name.charAt(i))) {
				countMap.put(name.charAt(i),countMap.get(name.charAt(i))+1);
			}
			else {
				countMap.put(name.charAt(i), 1);
			}
		}
		for(Map.Entry<Character, Integer> entry : countMap.entrySet()) {
			if(entry.getValue() >1) {
				duplicates.add(entry.getKey());
			}
		}
		return duplicates;
	}
	
	
	
	public static Set<Character> findDuplicatesUsingArray(String name) {
		Set<Character> duplicates = new LinkedHashSet<>();
		
		int[] arrayForChar = new int[256];
		for(int i =0; i< name.length();i++) {
			arrayForChar[name.charAt(i)] = arrayForChar[name.charAt(i)]+1;
		}
		for(int i =0; i<256;i++) {
			if(arrayForChar[i] > 1) {
				duplicates.add((char)i);
			}
		}
		return duplicates;
	}
	
	
	public static Set<Character> findDuplicatesUsingFor(String name){
		
		
		Set<Character> duplicates = new LinkedHashSet<>();
		for(int i =0; i< name.length();i++) {
			for(int j = i+1;j<name.length();j++) {
				if(name.charAt(i) == name.charAt(j)) {
					duplicates.add(name.charAt(j));
				}
			}
		}
	return duplicates;	
	}
}
