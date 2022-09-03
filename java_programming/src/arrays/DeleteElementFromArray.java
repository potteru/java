package arrays;

import java.util.Scanner;

public class DeleteElementFromArray {
	
	public static void main(String[] args) {
		int[] array = new int[] {1,2,3,4,5,6,7,8,9,0};
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter array index to delete Element: ");
			int nextInt = scan.nextInt();
			deleteAnElement(array,nextInt);
	}
	public static void deleteAnElement(int[]  array,int index) {
		System.out.println(index);
		int arraySize = array.length;
		// check input given index of array
		if(index < 0 || index > arraySize) {
			System.out.println("Invalid  Array Index ");
		}else {
			for(int i = index-1;i<arraySize;i++) {
				array[i]=array[i]+1;
			}
			arraySize --;
		}
		System.out.println("After Deleting Array Elements");
		for(int i=0;i< arraySize;i++){
			System.out.print(" "+array[i]);
		}
	}

}
