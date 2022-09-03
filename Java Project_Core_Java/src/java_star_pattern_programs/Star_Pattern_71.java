package java_star_pattern_programs;

public class Star_Pattern_71 {
	
	//*****
	// ****
	//  ***
	//   **
	//    *
	
	public static void main(String[] args) {
		
		int star = 5;
		int spaces = 0;
		
		for(int i=1;i<=5;i++) {
			
			for(int k=1;k<=spaces;k++) {
				System.out.print(" ");
			}
			for(int j =1; j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
			star--;
			spaces++;
		}
	}

}
