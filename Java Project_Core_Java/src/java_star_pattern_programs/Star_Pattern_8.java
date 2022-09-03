package java_star_pattern_programs;

public class Star_Pattern_8 {

	public static void main(String[] args) {

		//*
		//***
		//*****
		//*******
		
		int star = 1 ; 
		
		for(int i =1; i<=5; i++) {	// Rows
			for(int j =1; j <= star;j++) {	// Columns
				System.out.print("*");
			}
			System.out.println();
			star = star + 2;
		}
	}

}
