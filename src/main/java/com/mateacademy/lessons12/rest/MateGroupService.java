package com.mateacademy.lessons12.rest;

import com.mateacademy.lessons11.Person;
import javax.ws.rs.core.Response;

/**
 * @author spasko
 */


public interface MateGroupService {

	public Response getMateGroup();

	public Response addStudents(int groupId, Person person);
}
