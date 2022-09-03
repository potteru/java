package java_basic_programs;

import java.util.HashSet;

public class DuplicateElementsInArray {

	public static void main(String[] args) {

		String str[] = {"java","abcd","code","qw","abc"};
		
		// Approach-1
		boolean flag = false;
		for(int i = 0; i <= str.length-1; i++) {
			for(int j =i+1 ; j <= str.length-1; j++) {
				if(str[i] == str[j]) {
					System.out.println("Found Duplicate Elements: "+str[i]);
					flag = true;
				}
			}
		}
		if(flag == false) {
			System.out.println("Duplicate Elements not found");
		}
	
	
	// Approach - 2
		
	String arr[] = {"java","abcd","code","java","abcd"};
	HashSet<String> lang = new HashSet<String>();
//			System.out.println(lang.add("java"));
//			System.out.println(lang.add("python"));
//			System.out.println(lang.add("java"));
//			System.out.println(lang.add("xyz"));
	boolean flag1 = false;
		for(String str1: arr) {
			if(lang.add(str1)){
				System.out.println("Duplicate Elements found: "+str1);
				flag1 = true;
			}
		}
		if(flag1 == false) {
			System.out.println("Not found Duplicates");
		}
	
	}
}
