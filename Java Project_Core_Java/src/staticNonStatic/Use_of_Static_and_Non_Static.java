package staticNonStatic;

public class Use_of_Static_and_Non_Static {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.empName = "Adimurthy";
		emp.empId = 232;
		//emp.empCEOName = "shivam";
		Employee.empCEOName = "kailash";
		
		Employee emp1 = new Employee();
		emp1.empName = "p.Adimurthy";
		emp1.empId = 233;
		//emp1.empCEOName = "ohm.shivam";
		Employee.empCEOName = "kailash-1";
		
		Employee emp2 = new Employee();
		emp2.empName = "Adi";
		emp2.empId = 234;
		//emp2.empCEOName = "shiva";
		Employee.empCEOName = "kailash-2";
		
		emp.empDetails();
		emp1.empDetails();
		emp2.empDetails();
	}

}
