package java_star_pattern_programs;

public class Star_Print_H_Shape {

	public static void main(String[] args) {

		int i = 1;
		while (i <= 11) {
			System.out.print("*");
			if (i != 6) {
				System.out.print("          ");
			}
			System.out.print(" *");
			System.out.println();
			i++;
			if (i == 6) {
				for (int j = 2; j <= 6; j++) {
					System.out.print("* ");
				}
			}

		}
		System.out.println("-----------------------------------");
		h_shape(11);
		System.out.println("------------------------------------");
	}
	
	public static void h_shape(int n) {
	
		for(int i = 1; i <= n;) {
			System.out.print("*");
			if (i != 6) {
				System.out.print("          ");
			}
			System.out.print(" *");
			System.out.println();
			i++;
			if (i == 6) {
				for (int j = 2; j <= 6; j++) {
					System.out.print("* ");
				}
			}

		}
	}
	

}
