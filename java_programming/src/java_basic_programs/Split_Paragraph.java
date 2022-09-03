package java_basic_programs;

public class Split_Paragraph {

	public static void main(String[] args) {

		String str = "My name is adimurthy i am from AP ATP KDR AMDR NRP";
		
		System.out.println("The Original String is: "+str);
		String str1[] = str.split(" ");
		
		System.out.println("String After Spliting: ");
		for(int i = 0; i <= str1.length-1;i++) {
			System.out.println(str1[i]);
		}
	}

}
