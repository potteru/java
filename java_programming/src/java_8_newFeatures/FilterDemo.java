package java_8_newFeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterDemo {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(21);
		list.add(30);
		list.add(35);
		
		
		Stream<Integer> s = list.stream().filter(i -> i%2 ==0);
		s.forEach(x -> System.out.println(x));
		
		list.stream().filter(i -> i%2 ==0).forEach(x -> System.out.println(x));
	}

}