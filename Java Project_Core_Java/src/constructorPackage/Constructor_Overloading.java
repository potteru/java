package constructorPackage;

public class Constructor_Overloading {
	
	//Global variables
	int num1;
	int num2;
	String name;

	Constructor_Overloading(String nam){
		name = nam;
	}
	Constructor_Overloading(){
		num1 = 10;
		num2 = 20;
	}
	Constructor_Overloading(int a,int b){
		num1 = a;
		num2 = b;
	}
	
	public void studentName() {
		System.out.println("Student name is: "+name);
	}
	
	public void add() {
		System.out.println("Addition of two numbers: "+(num1+num2));
	}
	
	public static void main(String[] args) {

		Constructor_Overloading co = new Constructor_Overloading("Adimurthy");
		co.studentName();
		
		Constructor_Overloading co1 = new Constructor_Overloading();
		co1.add();
		
		Constructor_Overloading co2 = new Constructor_Overloading(1000,2000);
		co2.add();
		
		Constructor_Overloading co3 = new Constructor_Overloading(1,3);
		co3.add();
	}

}
