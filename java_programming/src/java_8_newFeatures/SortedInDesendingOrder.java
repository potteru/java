package java_8_newFeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SortedInDesendingOrder {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		
		//get Stream object
		Stream<Integer> openStream = list.stream();
		
		Stream<Integer> filteredStream = openStream.filter(i -> i>=20);
		Stream<Integer> sortedstream = filteredStream.sorted((i1,i2) -> i2.compareTo(i1));
		sortedstream.forEach(x -> System.out.println(x));
		
		//above code in single line
		Stream<Integer> newFilteredsortedlist = list.stream().filter(i -> i>=20).sorted((i1,i2) -> i2.compareTo(i1));
		newFilteredsortedlist.forEach(x -> System.out.println(x));
		
		
	}

}
