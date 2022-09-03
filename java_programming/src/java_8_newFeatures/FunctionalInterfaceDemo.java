package java_8_newFeatures;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
	
	public abstract void functionalabmethod();
	
	default void m1() {
		System.out.println("Hello default method 1");
	}
	default void m2() {
		System.out.println("Hello default method 2");
	}

}
