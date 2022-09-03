package compareAndCompareTo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, 10, "abc", new Address("abc1",1111));
		Employee e2 = new Employee(2, 30, "def", new Address("def1",9999));
		Employee e3 = new Employee(3, 70, "ghi", new Address("ghi1",6666));
		Employee e4 = new Employee(4, 25, "xyz", new Address("xyz1",5678));
		
		
		List<Employee> elist = new ArrayList<>();
		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		elist.add(e4);
		
		System.out.println("Unsorted order list: "+elist);
		
		System.out.println("**********************");
		Collections.sort(elist, new AgeComparator());
		System.out.println("Sorted according to Age: "+elist);
		
		System.out.println("**********************");
		Collections.sort(elist, new NameComparator());
		System.out.println("Sorted according to Name: "+elist);
		
		System.out.println("**********************");
		Collections.sort(elist, new AddressComparator());
		System.out.println("Sorted according to Address: "+elist);
	}

}
