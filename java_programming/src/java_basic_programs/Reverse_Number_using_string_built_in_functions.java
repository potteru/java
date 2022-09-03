package java_basic_programs;

public class Reverse_Number_using_string_built_in_functions {

	public static void main(String[] args) {

		int num = 11223344;
		String str = Integer.toString(num);
		String rev = "";
		
		System.out.println("Before Reversed the Number: "+num);
		for(int i = str.length()-1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		int revNum = Integer.parseInt(rev);
		System.out.println("After reversed The Number: "+revNum);
	}

}
