package collections;

import java.util.HashSet;

public class Hashset_1 {

	public static void main(String[] args) {

		HashSet <String> al = new HashSet <String>();

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
