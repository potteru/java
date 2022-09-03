package arrays;

public class MaxDifference {
	
	public static int brutuForce(int[] array) {
		
		int max=0;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j< array.length;j++) {
				if(array[i] < array[j]) {
					max = Math.max(max, array[j]-array[i]);
				}
			}
		}
		return max;
	}
	
	public static int maxDiffrence(int[] array) {
		int maxDiff = array[0]-array[1];
		int minEle = array[0];
		
		for(int i=0;i< array.length;i++) {
			if((array[i]-minEle) > maxDiff) {
				maxDiff = array[i]-minEle;
			}
		}
		return maxDiff;
	}
	
	public static void main(String[] args) {
		int[] array = {5,6,15,18,30};
		
		System.out.println(brutuForce(array));
		
		System.out.println(maxDiffrence(array));
	}
}
