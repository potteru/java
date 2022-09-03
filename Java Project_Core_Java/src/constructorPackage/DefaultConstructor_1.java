package constructorPackage;

public class DefaultConstructor_1 {
	
	/*//  Default compiler will provide default constructor
	 * DefaultConstructor_1(){ System.out.println("Default constructor-1"); }
	 */
	
	public static void m1() {
		System.out.println("Regular Static method m1");
	}
	public void m2() {
		System.out.println("Regular  method m2");
	}

	public static void main(String[] args) {

		DefaultConstructor_1 dc1 = new DefaultConstructor_1();
		
		m1();
		dc1.m2();
	}

}
