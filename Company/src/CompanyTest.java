
public class CompanyTest {

	public static void main(String[] args) {

		Person person = new Person("Cathy", "Dublin", "123", "cathy@gmail.com");
		
		Student student = new Student("Mary", "Cork", "514", "mary100@aol.com", Student.FRESHMAN);
		
		Employee employee = new Employee("Mike", "Belfast", "618", "mike80@aol.com", 910, 60000);

		Faculty faculty = new Faculty("Sue", "Galway", "41", "sue28@aol.com", 101, 50000, "4pm to 6pm", "Professor");

		Staff staff = new Staff("Tom", "Kilkenny", "203", "tomcat@aol.com", 12, 65000, "Executive Assistant");
		
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}

}
