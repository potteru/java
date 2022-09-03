package java_8_newFeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		//with streams 
		List<Integer> list1 = new ArrayList<>();
		list1 = list.stream().filter(x -> x >= 15).collect(Collectors.toList());
		list1.stream().forEach(x -> System.out.println(x));

		// without stream
		List<Integer> arList = findElements(list);
		for (Integer i : arList) {
			System.out.println(i);
		}
	}

	public static List<Integer> findElements(List<Integer> list) {
		List<Integer> list2 = new ArrayList<>();

		for (Integer i : list) {
			if (i >= 15) {
				list2.add(i);
			}

		}
		return list2;
	}

}
