package constructorPackage;

public class UserdefinedconstructorWithNoParameter {
	
	// Global variable declaration
	int num1;
	int num2;

	UserdefinedconstructorWithNoParameter(){
		num1 = 10;
		num2 = 20;
	}
	public void add() {
		System.out.println("Addition of two numbers: "+(num1+num2));
	}
	public void sub() {
		System.out.println("Subtraction of two numbers: "+(num2-num1));
	}
	public void mul() {
		System.out.println("Multiplication of two numbers: "+(num1*num2));
	}
	

	public static void main(String[] args) {

		UserdefinedconstructorWithNoParameter udcwnp = new UserdefinedconstructorWithNoParameter();
		udcwnp.add();
		udcwnp.sub();
		udcwnp.mul();
	}

}
