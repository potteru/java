package java_8_newFeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SortedDemo {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		list.add(30);
		
		//get stream object
		Stream<Integer> openstream = list.stream();
		//configure stream by filtering out required values
		Stream<Integer> filteredstream = openstream.filter(i -> i>=20);
		Stream<Integer> sortedstream = filteredstream.sorted();
		sortedstream.forEach(x -> System.out.println(x));
		
		//above in single line
		Stream<Integer> newFilteredSortedList = list.stream().filter(i -> i>=20).sorted();
		newFilteredSortedList.forEach(x -> System.out.println(x));
	}

}
