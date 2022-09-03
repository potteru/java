package staticNonStatic;

public class Employee {

		String empName;
		int empId;
	//	String empCEOName;
		static String empCEOName;
		

		public void empDetails() {
			System.out.println(empName +":"+empId + ":" +empCEOName);
		}

}
