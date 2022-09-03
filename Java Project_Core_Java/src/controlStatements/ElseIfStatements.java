package controlStatements;

public class ElseIfStatements {

	public static void main(String[] args) {

		int marks = 65;
		
		if(marks >= 65) {
			System.out.println("Distinction");
		}
		else if(marks >= 60) {
			System.out.println("1st class Pass");
		}
		else if(marks >= 50) {
			System.out.println("2nd class Pass");
		}
		else if(marks >= 35) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}

}
