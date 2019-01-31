package lesson11.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import lesson10.xmljson.MateGroup;
import lesson10.xmljson.Person;
import lesson10.xmljson.Teacher;

/**
 * @author spasko
 */
// Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.DOCUMENT)  //генерируется всдл
public interface MateGroupService {

	@WebMethod
	public MateGroup getMateGroup();

	@WebMethod
	public MateGroup addStudents(List<Person> persons);

//	@WebMethod
//	public MateGroup removeStudents(List<Person> persons);
}