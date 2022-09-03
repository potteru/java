package constructorPackage;

public class ConstructorOverLoading {
	
	String name; // Global variable 
	
	ConstructorOverLoading(){
		
		System.out.println("Default Constructor");
	}
	ConstructorOverLoading(String str){
		name = str;
		System.out.println("Parametarised Constructor"+ name);
	}

	public static void main(String[] args) {

		ConstructorOverLoading col = new ConstructorOverLoading();
		ConstructorOverLoading col1 = new ConstructorOverLoading("adimurthy");
		
	}

}
