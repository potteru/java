package static_and_non_static_methods;

public class NonStaticRegularMethodFromDifferentClass {

	public static void main(String[] args) {

		System.out.println("Before NonStaticRegularMethodFromDifferentClass");
		
		SampleClass_2 sm2 = new SampleClass_2();
		sm2.m1();
		
		SampleClass_2 sm = new SampleClass_2();
		sm.m2();
		
		System.out.println("After NonStaticRegularMethodFromDifferentClass");
	}

}
