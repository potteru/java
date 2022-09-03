package java_8_newFeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountDemo {
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
		long streamcount = filteredStream.count();
		System.out.println(streamcount);
		
		//now in singleline
		Long newFileStreamCount = list.stream().filter(i -> i>=20).count();
		System.out.println(newFileStreamCount);
	}

}
