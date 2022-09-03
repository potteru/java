package abstract_package;

public class Abstract_Demo extends Abstract_class_Demo {

	public static void main(String[] args) {

		m2();
		Abstract_Demo ab = new Abstract_Demo();
		ab.m1();
	}

	@Override
	public void m1() {

		System.out.println("Demo abstract class method m1");
	}

}
