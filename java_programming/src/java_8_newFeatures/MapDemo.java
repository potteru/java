package java_8_newFeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(25);
		list.add(30);
		
		Stream<Integer> s = list.stream().map(i -> i*i);
		s.forEach(x -> System.out.println(x));
		
		list.stream().map(i -> i*i).forEach(x -> System.out.println(x));
	}

}
