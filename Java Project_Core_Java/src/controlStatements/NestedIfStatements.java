package controlStatements;

public class NestedIfStatements {

	public static void main(String[] args) {

		int age = 18;
		int weight = 65;
		if(age >= 18) {
			System.out.println("Age is Greater than 18 years");
			if(weight >=50) {
				System.out.println("Eligible for blood donation");
			}
			else {
				System.out.println("Not Eligible for blood donation weight less than 50kg");
			}
		}
		else {
			System.out.println("Not Eligible for blood donation Age Less than 18 years");
		}
		
	}

}
