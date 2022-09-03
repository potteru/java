package static_and_non_static_methods;

public class CombineExampleMethods {

	public static void main(String[] args) {

		System.out.println("Before CombineExampleMethods");
		
		// static method
		m1();
		
		//Non static method
		CombineExampleMethods cme = new CombineExampleMethods();
		cme.m2();
		
		// Another class static method
		SampleClass_3.m3();
		
		//Another class Non-static method
		SampleClass_3 sm = new SampleClass_3();
		sm.m4();
		
		System.out.println("After CombineExampleMethods");
	}
	
	public static void m1() {
		System.out.println("Same class static method m1");
	}
	public void m2() {
		System.out.println("Same class Non-static method m2");
	}

}
