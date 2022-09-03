package java_8_newFeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		
		//get stream object
		Stream<Integer> openStream = list.stream();
		
		//configure stream by filtering out required value
		Stream <Integer> filteredStream = openStream.filter(i -> i>=20);
		List<Integer> newFilterList = filteredStream.collect(Collectors.toList());
		newFilterList.stream().forEach(x -> System.out.println(x));
		
		//now in singleline
		List<Integer> collect = list.stream().filter(i -> i>=20).collect(Collectors.toList());
		collect.forEach(x  -> System.out.println(x));
		
		
	}

}
