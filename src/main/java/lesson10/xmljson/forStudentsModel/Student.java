package lesson10.xmljson.forStudentsModel;

/**
 * @author spasko
 */
public class Student extends Person {

	public String getSurname() {
		return super.getSurname();
	}

	public Student() {

	}

	public Student(String name, String surname, int yearOfBorn) {
		super(name, surname, yearOfBorn);
	}

}
