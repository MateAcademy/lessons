package lesson11.rest;

import javax.ws.rs.core.Response;

import lesson10.xmljson.Person;

/**
 * @author spasko
 */

public interface MateGroupService {

	public Response getMateGroup(int groupId);

	public Response addStudents(int groupId, Person person);
}