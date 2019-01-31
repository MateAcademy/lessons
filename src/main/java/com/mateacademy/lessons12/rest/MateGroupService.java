package com.mateacademy.lessons12.rest;

import javax.ws.rs.core.Response;

import com.mateacademy.lessons11.*;

/**
 * @author spasko
 */

public interface MateGroupService {

	public Response getMateGroup();

	public Response addStudents(int groupId, Person person);

//	public Response putTeacher(int groupId, Teacher teacher);
}