package java_basic_programs;

public class Fibanaci_Recursion {

	static int n1 = 0,n2 = 1,n3 = 0;
	public static void main(String[] args) {

		System.out.println(n1+" "+n2);
		int count = 10;
		fibanaci(count-2);
	}
	public static void fibanaci(int count) {

		if(count >0) {
		n3=n1 + n2;
		System.out.println(""+n3);
		n1 = n2;
		n2 = n3;
		fibanaci(count-1);
		}
	}

}
