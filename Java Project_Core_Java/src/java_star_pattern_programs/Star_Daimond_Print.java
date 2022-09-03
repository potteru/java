package java_star_pattern_programs;

public class Star_Daimond_Print {

	public static void main(String[] args) {

		int star = 1; // initial stars
		int leftSpaces = 10; // initial left side spaces
		int rightSpaces = 0; // initial right side spaces
		//int rightStars = 2;
		
		for(int i= 1; i <= 10; i++) { // number of rows
			
			for(int j = 1; j<= leftSpaces; j++) { // left side spaces
				System.out.print(" ");
			}
			for(int k = 1; k<= star; k++) { // left side stars
				System.out.print("*");
			}
			for(int l = 0; l <= rightSpaces; l++) { // right side spaces
				System.out.print(" ");
			}
			for(int m =2 ; m <= star; m++) { // right side stars starts at 2nd row
				System.out.print("*");
			}
			System.out.println();
			star++; // increasing stars
			leftSpaces--; // decreasing left side spaces
			rightSpaces--; // decreasing right side spaces
		}
	}

	
}
