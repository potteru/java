package java_8_newFeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MinAndMaxDemo {
	public static void main(String[] args) {
		
		List <Integer>list = new ArrayList<Integer>();
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		list.add(30);
		
		//get stream object
		Stream<Integer> openstream = list.stream();
		Stream<Integer> filteredStream = openstream.filter(i -> i>=20);
		
		Integer maxinteger = filteredStream.max((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println(maxinteger);
		
		//Integer mininteger = filteredStream.min((i1,i2) -> i1.compareTo(i2)).get();
		//System.out.println(mininteger);
		
		// above code in single line
		Integer maxvalue = list.stream().max((i1,i2) -> i1.compareTo(i2)).get();
		Integer minvalue = list.stream().min((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println(maxvalue);
		System.out.println(minvalue);		
	}

}
