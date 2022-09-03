package java_star_pattern_programs;

public class Star_Pattern_81 {
	
	//    *
	//   **
	//  ***
	// ****
	//*****
	
	public static void main(String[] args) {
		
		int star = 1;
		int spaces = 4;
		
		for(int i = 1;i <= 5;i++) {
			for(int j = 1; j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int k=1; k <= star; k++) {
				System.out.print("*");
			}
			System.out.println();
			star++;
			spaces--;
		}
	}

}
