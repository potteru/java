package java_8_newFeatures;

import java.util.function.BiConsumer;

public class LamdaDemo {

	public static void main(String[] args) {
//		LamdaDemo demo = new LamdaDemo();
//		demo.add(2, 7);

		// Using Java 8 new features implementing addition function
		BiConsumer<Integer, Integer> biconsumer = (a, b) -> System.out.println(a + b);
		biconsumer.accept(10, 30);
	}
//	public void add(int a, int b) {
//		System.out.println(a+b);
//	}

}
