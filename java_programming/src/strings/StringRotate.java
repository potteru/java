package strings;

public class StringRotate {
	
	public static void main(String[] args) {
		String originalString = "decode";
		String toBeChecked = "deocde";
		
		System.out.println(checkForRotation(originalString,toBeChecked));
		
		int rotationCharacters = 2;
		System.out.println(leftRotation(originalString,rotationCharacters));
		
		System.out.println(rightRotation(originalString,rotationCharacters));
		
	}
	// checking rotaed string 
	private static boolean checkForRotation(String originalString,String toBeChecked) {
		String concatination = originalString + originalString;
		if(concatination.contains(toBeChecked)) {
			return true;
		}
		return false;
	}
	// rotated string left by 2 characters
	public static String leftRotation(String originalString,int r) {
		//decode - //codede
		String rotatedString = originalString.substring(r) + originalString.substring(0, r);
								//code							//de
		return rotatedString;
	}
	
	//rotated string right by 2 characters
	public static String rightRotation(String originalString,int rotationCharacters) {
		//decode --//dedeco
		int partition = originalString.length() - rotationCharacters;
		String rotatedString = originalString.substring(partition) + originalString.substring(0, partition);
		return rotatedString;
		
	}

}
