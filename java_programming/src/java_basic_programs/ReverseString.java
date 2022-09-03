package java_basic_programs;

public class ReverseString {

	public static void main(String[] args) {

		//1. Using concatenation operator
		String str = "ABCD";
		String rev = "";
		
		int length = str.length();
		for(int i = length-1; i >= 0;i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("First Reversed String: "+rev);
		
		
		
		//2. Using Char array
		char a[] = str.toCharArray();
		String rev2 = "";
		int length2 = a.length;
		for(int i = length2-1;i>=0;i--) {
			rev2 = rev2+a[i];
		}
		System.out.println("Second Reversed String: "+rev2);
		
		
		//3. Using String Buffere
		StringBuffer sb = new StringBuffer(str);
		System.out.println("Third Reversed String: "+sb.reverse());
		
	}

}
