package java_star_pattern_programs;

public class Star_Pattern_7 {

	public static void main(String[] args) {

		//*******
		//*****
		//***
		//*
		
		int star = 7;
		
		for(int i =1; i <=7 ; i++) {
			for(int j =1; j<=star; j++) {
				System.out.print("*");
			}
			System.out.println();
			star = star-2;
		}
	}

}
