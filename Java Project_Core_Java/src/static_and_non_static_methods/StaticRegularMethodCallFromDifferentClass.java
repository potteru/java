package static_and_non_static_methods;

public class StaticRegularMethodCallFromDifferentClass {

	public static void main(String[] args) {

		System.out.println("Before StaticRegularMethodCallFromDifferentClass");
		SampleClass.m1();
		SampleClass.m2();
		System.out.println("After StaticRegularMethodCallFromDifferentClass");
	}

}
