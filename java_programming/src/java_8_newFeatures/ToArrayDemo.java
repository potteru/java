package java_8_newFeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ToArrayDemo {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		list.add(30);
		
		//get stream object
		Stream<Integer> openstream = list.stream();
		Stream<Integer> filteredstream = openstream.filter(i -> i >=20);
		Object[] array = filteredstream.toArray();
		for(Object arrObjects : array) {
			System.out.println("Elements in array is: "+arrObjects);
		}
		
		// above code in single line
		Object[] array2Objects = list.stream().filter(i -> i>=20).toArray();
		for(Object arrObjects : array2Objects) {
			System.out.println("Elements in array objects is: "+arrObjects);
		}		
	}

}
