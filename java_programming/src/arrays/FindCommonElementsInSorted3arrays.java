package arrays;

// Find common Elements in sorted arrays
// int[] arr = {1,2,3,4,5,6,7,8,9};
//int[] arr1 = {1,2,3,4,5,6,7,8,9};
//int[] arr2 = {1,2,3,4,5,6,7,8,9};

/*Begineers approach time complexity O(N^3)
 * public static void commonElements(int[] arr,int[] arr2,int[] arr3){
 * 
 * for(int i = 0; i< arr.length; i++){
 * 		for(for j = 0; j< arr2.length; j++){
 * 			for k=0; k< arr3.length;k++){
 * 				if(arr[i] == arr2[j] && arr2[j] == arr3[k]){
 * 					System.out.println(arr[i]);	
 * 				}
 * 			}
 * 		}
 */
public class FindCommonElementsInSorted3arrays {
	
	public static void commonElements(int[] arr,int[] arr2,int[] arr3) {
		int x=0,y=0,z=0;
		
		while(x < arr.length && y < arr2.length && z < arr3.length ) {
			if(arr[x] == arr2[y] && arr2[y] == arr2[z]) {
				System.out.println(arr[x]);
				x++;
				y++;
				z++;
			}else if(arr[x] > arr2[y]) {
				y++;
			}else if(arr[y] > arr2[z]) {
				z++;
			}else {
				x++;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {0,1,2,3,4,5,6,7,8,9};
		int[] arr2 = new int[] {0,1,2,3,4,5,6,7,8,9};
		int[] arr3 = new int[] {0,1,2,3,4,5,6,7,8,9};
		
		commonElements(arr,arr2,arr3);
	}

}
