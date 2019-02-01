package lesson11.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import lesson10.xmljson.MateGroup;
import lesson10.xmljson.Person;

/**
 * @author spasko
 */
// Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface MateGroupService {

	@WebMethod
	public MateGroup getMateGroup(Integer groupId);

	@WebMethod
	public MateGroup addStudents(Integer groupId, List<Person> persons);
}