package controlStatements;

public class NestedIfStatements_1 {

	public static void main(String[] args) {

		int amount = 60;
		if(amount >= 500) {
			System.out.println("No delivery charges");
			if(amount >=5000) {
				System.out.println("Eligible for 10% discount");
			}
			else {
				System.out.println("No discount");
			}
		}
		else {
			System.out.println("Delivery charges 50 Rupees");
		}
	}

}
