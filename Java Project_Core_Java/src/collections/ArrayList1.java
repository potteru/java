package collections;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		// System.out.println(al.isEmpty()); // true

		al.add("rahul");
		al.add(100);
		al.add('A');
		al.add(65.5f);
		al.add("rahul"); // 500
		al.add(null); // rahul
		al.add(null); //

		 System.out.println(al);
		 System.out.println(al.size());
		 System.out.println(al.get(2));
		 System.out.println(al.contains(100)); // true
		 System.out.println(al.contains(200)); // false
		 System.out.println(al.isEmpty()); // false
		
		 al.add(2, "Hello");
		
		 System.out.println(al);
		
		 al.remove(4);
		
		 System.out.println(al);

		 //for each loop
		 for (Object value : al) {
		 System.out.println(value);
		 }

		for (int i = 0; i <= al.size() - 1; i++) {
			System.out.println(al.get(i));
		}

	}

}
