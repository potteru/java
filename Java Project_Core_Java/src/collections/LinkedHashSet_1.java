package collections;

import java.util.LinkedHashSet;

public class LinkedHashSet_1 {

	public static void main(String[] args) {

		LinkedHashSet<String> al = new LinkedHashSet<String>();

		al.add("rahul");
		al.add("Amay");
		al.add("Vijay");
		al.add("Kapil");
		al.add("Priya");
		al.add("rahul");
		al.add(null);
		al.add(null);

		// for each loop

		for (String str : al) {
			System.out.println(str);
		}

	}

}
