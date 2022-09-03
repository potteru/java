package arrays;

/*
 * segregate 0's and 1's in given array
 * input : int[] a = {0,1,0,1,0,1,0,1,0,1};
 * output : int[] a = {0,0,0,0,0,1,1,1,1,1};
 * 
 */

public class Segregate0sAnd1s {
	public static void main(String[] args) {
		
		int[] array = {0,1,0,0,1,1,0,1,0,0,1,};
		int j=0;
		
		for(int i=0;i< array.length;i++) {
			if(array[i] == 0) {
			array[j++] = array[i];
			//System.out.println("for loop");
			}
		}
		while(j < array.length) {
			array[j++] = 1;
			//System.out.println("while loop");
		}
		
		for(int k = 0; k < array.length ;k++) {
			System.out.print(array[k]+" ");
		}
	}

}
