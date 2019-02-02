package com.mateacademy.lessons13.rest;

import javax.ws.rs.core.Response;

import com.mateacademy.lessons11.*;
/**
 * @author spasko
 */

public interface MateGroupService {

	public Response getMateGroup(int groupId);

	public Response addStudent(int groupId, Person person);
	
	public Response removeStudent(int groupId, String surname);

	public Response updateStudent(int groupId, String surname, String newname);


}