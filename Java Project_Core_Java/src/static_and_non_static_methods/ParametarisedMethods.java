package static_and_non_static_methods;

public class ParametarisedMethods {
	
	public static void main(String[] args) {
		m1("Aadi","Yogi");
		ParametarisedMethods pm = new ParametarisedMethods();
		pm.m2("Abc","Def");
		ParametarisedMethods pm1 = new ParametarisedMethods();
		pm1.colour(5);
		ParametarisedMethods pm2 = new ParametarisedMethods();
		pm2.add(10,15);
	}
	
	public static void m1(String fName,String lName) {
		System.out.println("First name: "+fName);
		System.out.println("Last name: "+lName);
	}
	public void m2(String fName,String lName) {
		System.out.println("first name: "+fName);
		System.out.println("last name: "+lName);
	}
	public void colour(int colours) {
		System.out.println("The number of colours: "+colours);
	}
	public void add(int num1,int num2) {
		System.out.println("Addition of two numbers: "+(num1+num2));
	}

}
