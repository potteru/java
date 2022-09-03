package java_star_pattern_programs;

public class Star_Diamond_Upside_Down {

	public static void main(String[] args) {

		int star = 10;
		int leftSpaces = 0;
		int rightSpaces = 0;
		
		for(int i = 1; i <= 10; i++) {
			
			for(int j = 0; j <= leftSpaces; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= star; k++) {
				System.out.print("*");
			}
			for(int l = 1 ; l <= rightSpaces; l++) {
				System.out.print(" ");
			}
			for(int m = 1; m <= star-1; m++) {
				System.out.print("*");
			}
			System.out.println();
			star--;
			rightSpaces--;
			leftSpaces++;
		}
	}

}
