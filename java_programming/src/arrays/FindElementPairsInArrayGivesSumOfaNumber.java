package arrays;

//Find pairs with given Sum in a sorted array
//Given an array A of size N
//we need to find all pairs in the array that sum to a number equal to k.
//If No such pair found then return -1
		
		

public class FindElementPairsInArrayGivesSumOfaNumber {
	
	public static void main(String[] args) {
		int[] array = new int[] {0,1,2,3,4,5,6,7,8,9};
		int sum = 5;
		
		int low = 0;
		int high = array.length -1;
		while(low < high) {
			if(array[low]+array[high] > sum) {
				high --;
			}else if(array[low]+array[high] < sum){
				low++;
			}else if(array[low]+array[high] == sum) {
				System.out.println("pair("+array[low]+","+array[high]+")");
				low++;
				high--;
			}
		}
		
	}

}
