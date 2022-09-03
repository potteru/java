package arrays;

/* Merge two sorted arrays
 * Given two sorted arrays and merge them in sorted manner
 * 
 * arr1 = {1,2,3,4,5};
 * arr2 = {5,6,7,8,9,0};
 * 
 * result = {0,1,2,3,4,5,6,7,8,9}
 * 
 * 
 */
public class MergeTwoSortedArrays {
	
	public static int[] mergeTwoArrays(int[] array1,int[] array2) {
		int len1 = array1.length;
		int len2 = array2.length;
		
		int[] resultlen = new int[len1+len2];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < len1 && j < len2) {
			if(array1[i] < array2[j] ) {
				resultlen[k++] = array1[i++];
			}else {
				resultlen[k++] = array2[j++];
			}
		}
		while(i < len1) {
			resultlen[k++] = array1[i++];
		}
		while(j < len2) {
			resultlen[k++] = array2[j++];
		}
		return resultlen;
	}
	
	public static void main(String[] args) {
		
		int[] array1 = {1,5,6,7};
		int[] array2 = {2,5,8,9,11};
		
		int[] result = mergeTwoArrays(array1,array2);
		for(int i= 0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}

}
