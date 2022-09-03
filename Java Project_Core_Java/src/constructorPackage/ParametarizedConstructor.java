package constructorPackage;

public class ParametarizedConstructor {
	
	ParametarizedConstructor(int n){
		int sum = n;
		System.out.println("Parametarized constructor value: "+sum);
	}

	public static void main(String[] args) {

		ParametarizedConstructor pm = new ParametarizedConstructor(10);
	}

}
