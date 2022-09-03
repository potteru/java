package inheritance;

public class HirarchicalInheritance {

	public static void main(String[] args) {

		System.out.println("Child_1 Properties");
		Child_1 c1 = new Child_1();
		c1.car();
		c1.home();
		c1.money();
		c1.mobile();
		
		System.out.println("Child_2 Properties");
		Child_2 c2 = new Child_2();
		c2.car();
		c2.home();
		c2.money();
		c2.bike();
		
		System.out.println("Child_3 Properties");
		Child_3 c3 = new Child_3();
		c3.car();
		c3.home();
		c3.money();
		c3.laptop();
	}

}
