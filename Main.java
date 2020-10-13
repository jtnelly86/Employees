
public class Main {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1234561);
		Employee e2 = new Employee(1234562);
		Employee e3 = new Employee(1234563);
		
		e1.setFirstName("Bugs");
		e1.setLastName("Bunny");
		e1.setStatus("F");
		e1.setAge(80);
		e1.setTitle("The King of Carrots");
		e1.setSalary(150000);
		
		e2.setFirstName("Daffy");
		e2.setLastName("Duck");
		e2.setStatus("P");
		e2.setAge(77);
		e2.setTitle("The Duke of Ducks");
		e2.setSalary(75000);
		
		e3.setFirstName("Porky");
		e3.setLastName("Pig");
		e3.setStatus("W");
		e3.setAge(85);
		e3.setTitle("The Baron of Bacon");
		e3.setSalary(55000);
		
		e1.printEmployee();
		e2.printEmployee();
		e3.printEmployee();

	}

}
