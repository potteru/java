package arrayPkg;

public class Array_Demo {

	public static void main(String[] args) {

		int a;
		int b[] = new int[5]; // array declaration
		int c[] = {1,2,3,4,5,6}; // array declaration and defination (array initialization)
		
		b[0] = 10;
		b[1] = 20;
		b[2] = 30;
		b[3] = 40;
		b[4] = 50;
		
		System.out.println(b[4]);
		System.out.println(b.length);
		
		for(int i=0; i<=5;i++) { // printing 1 to 5 
			System.out.print(i+",");
		}
		
		for(int i = 0;  i <  b.length; i++) { // printing array elements 0 to n 
			System.out.print(b[i]+",");
		}
		System.out.println();
		String []str = new String[5];
		
		str[0] = "abc";
		str[1] = "bcd";
		str[2] = "def";
		str[3] = "ghi";
		str[4] = "jkl";
		
		System.out.println(str[2]);
		
		for(int i = 0; i <= str.length-1;i++) {
			System.out.print(str[i]+",");
		}
		System.out.println();
		
		
		int d[] = {32,0,4,56,67,87,90,4343,65,33};
		
		
	}
	

	
	
	

}
