package constructorPackage;

public class User_defined_constructor_With_Parameters {

	//Global variables
	
	int a;
	int b;
	User_defined_constructor_With_Parameters(int x,int y){
		a = x;
		b = y;
	}
	public void add() {
		System.out.println("Addition of two numbers: "+(a+b));
	}
	public void sub() {
		System.out.println("Subtraction of two numbers: "+(a-b));
	}
	public void mul() {
		System.out.println("Multiplication of two numbers: "+(a*b));
	}
	
	public static void main(String[] args) {

		User_defined_constructor_With_Parameters udcwp = new User_defined_constructor_With_Parameters(10,20);
		udcwp.add();
		udcwp.sub();
		udcwp.mul();
		
		System.out.println("-------------------");
		
		User_defined_constructor_With_Parameters udcwp1 = new User_defined_constructor_With_Parameters(100,200);
		udcwp1.add();
		udcwp1.sub();
		udcwp1.mul();
		
		System.out.println("--------------------");
		
		User_defined_constructor_With_Parameters udcwp2 = new User_defined_constructor_With_Parameters(1000,2000);
		udcwp2.add();
		udcwp2.sub();
		udcwp2.mul();
	}

}
