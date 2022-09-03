package static_and_non_static_methods;

public class NonStaticRegularMethodFromSameClass {

	public static void main(String[] args) {

		System.out.println("Before NonStaticRegularMethodFromSameClass");
		//object-1
		NonStaticRegularMethodFromSameClass sm = new NonStaticRegularMethodFromSameClass();
		sm.m1();
		//object-2
		NonStaticRegularMethodFromSameClass sm1 = new NonStaticRegularMethodFromSameClass();
		sm1.m2();
		
		System.out.println("After NonStaticRegularMethodFromSameClass");
	}
	public  void m1() {
		System.out.println("Non static method m1");
	}
	public void m2() {
		System.out.println("Non static method m2");
	}

}
