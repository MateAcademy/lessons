package lesson10.xmljson.forStudentsModel;

/**
 * @author spasko
 */
public class Teacher extends Person {
	private int salary;

	public Teacher(String name, String surname, int yearOfBorn, int salary) {
		super(name, surname, yearOfBorn);
		this.salary = salary;
	}

	public Teacher() {
		super();
	}

	@Override
	public String getName() {
		return super.getName();
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Teacher [salary=" + salary + " " + super.toString() + "]";
	}

}
