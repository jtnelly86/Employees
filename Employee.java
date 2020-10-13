
public class Employee {

	int employeeID;
	String firstName;
	String lastName;
	int age;
	String title;
	private double salary = 50000;
	String status;
	
	public Employee(int employeeID) {
		this.employeeID = employeeID;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		
		if (status == "F" || status == "P" || status == "C" || status == "T") {
			this.status = status;
		}
		else {
			this.status = "Unknown";	
		}
		
	}

	/**
	 * @return the employeeID
	 */
	public int getEmployeeID() {
		return employeeID;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	public void printEmployee() {
		

		System.out.println();
		printDashes(27);
		System.out.println("Employee Report");
		printDashes(27);
		System.out.println("Name: " + this.getFirstName() + " " + this.getLastName());
		System.out.println("Age: " + this.getAge());
		System.out.println("Title: " + this.getTitle());
		System.out.println("Employee ID: " + this.getEmployeeID());
		System.out.println("Status: " + this.getStatus());
		System.out.printf("Yearly Salary: $%,.2f\n", salary);
		printDashes(27);
		System.out.println();
	}
	
	private void printDashes(int x) {
		for (int i = 0; i <= x; i++) {
			
			System.out.print("-");
			
		}
		System.out.println("");
	}
	
}
