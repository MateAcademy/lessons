package lesson11.soap;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import lesson10.xmljson.Person;
import lesson10.xmljson.Student;
import lesson10.xmljson.Teacher;

/**
 * @author spasko
 */
public class MateGroupServiceClient {

	public static void main(String[] args) throws Exception {

		URL url = new URL("http://localhost:9999/ws/mate?wsdl");

		// 1st argument service URI, refer to wsdl document above
		// 2nd argument is service name, refer to wsdl document above
		QName qname = new QName("http://soap.lesson11/", "MateGroupServiceImplService");

		Service service = Service.create(url, qname);

		MateGroupService hello = service.getPort(MateGroupService.class);

		System.out.println(hello.getMateGroup(18122018));

		List<Person> persons = new ArrayList<>();
		persons.add(new Student("First", "First", 1995));
		persons.add(new Teacher("Second", "Second", 1990, 666));
		System.out.println(hello.addStudents(18122018, persons));

	}

}