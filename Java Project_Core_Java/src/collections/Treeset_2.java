package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset_2 {

	public static void main(String[] args) {

		TreeSet tr = new TreeSet();

		tr.add(400);
		tr.add(500);
		tr.add(100);
		tr.add(300);
		tr.add(600);
		tr.add(200);
		tr.add(200);

		// System.out.println(tr);

		// for each loop

		// for (Object str : tr) {
		// System.out.println(str);
		// }

		Iterator itr = tr.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next()); // fgkrh
		}

	}

}
