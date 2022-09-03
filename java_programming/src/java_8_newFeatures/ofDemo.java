package java_8_newFeatures;

import java.util.stream.Stream;

public class ofDemo {
	
	public static void main(String[] args) {
		
		Stream.of(1,11,111,1111,11111).forEach(x -> System.out.println(x));
		String[] name = {"aadi","atp","ap"};
		Stream.of(name).filter(x -> x.length() > 2 ).forEach(x -> System.out.println(x));
		
	}

}
