package collections;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {

		Vector<String> al = new Vector<String>();

		// System.out.println(al.isEmpty()); // true

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
