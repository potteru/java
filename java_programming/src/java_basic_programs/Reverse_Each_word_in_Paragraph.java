package java_basic_programs;

public class Reverse_Each_word_in_Paragraph {

	public static void main(String[] args) {

		String str = "My name is adimurthy i am from AP ATP KDR AMDR NRP";

		System.out.println("The Original String is: " + str);
		String str1[] = str.split(" ");

		System.out.println("String After Spliting: ");
		for (int i = 0; i <= str1.length - 1; i++) {
			String originalStr = str1[i];
			
			String rev = "";
			for(int j = originalStr.length()-1; j >= 0; j--) {
				rev = rev + originalStr.charAt(j); 
			}
			System.out.print(" "+rev);
		}
	}

}
