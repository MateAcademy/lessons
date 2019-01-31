package lesson10.xmljson.forStudentsModel;

import java.io.Serializable;

/**
 * @author spasko
 */

public class Person implements Serializable {
	private String name;
	private String surname;
	private int yearOfBorn;

	public Person() {
	}

	public Person(String name, String surname, int yearOfBorn) {
		this.name = name;
		this.surname = surname;
		this.yearOfBorn = yearOfBorn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getYearOfBorn() {
		return yearOfBorn;
	}

	public void setYearOfBorn(int yearOfBorn) {
		this.yearOfBorn = yearOfBorn;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", yearOfBorn=" + yearOfBorn + "]";
	}

}
